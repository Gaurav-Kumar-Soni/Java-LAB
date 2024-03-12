import java.util.Scanner;

public class naturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer Number: ");
        int num = sc.nextInt();
        int sum = num * (num + 1) / 2;

        System.out.println("Sum of " + num + " Natural numbers is: " + sum);
        sc.close();
    }
}
