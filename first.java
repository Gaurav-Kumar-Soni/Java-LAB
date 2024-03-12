import java.util.Scanner;

class first {
    public void Ryzen(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        first obj = new first();
        obj.Ryzen(name);
        sc.close();
    }
}