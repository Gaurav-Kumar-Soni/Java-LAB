import java.util.Scanner;
import java.lang.Math;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, d = num, i = 0;

        while (d != 0) {
            i++;
            d = d / 10;
        }
        int x = num;

        while (x != 0) {
            sum += Math.pow(x % 10, i);
            x = x / 10;
        }

        if (num == sum) {
            System.out.println("It is Armstrong Number.");
        } else {
            System.out.println("Its not Armstrong Number.");
        }
        sc.close();
    }

}