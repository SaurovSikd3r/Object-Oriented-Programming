import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age:");
        age = input.nextInt();
        if (age > 13) {
            System.out.println("You are eligible to register the website");
            System.out.println("You can register also using the mobile app");
        } else
            System.out.println("Sorry, you are too young to register to our website");

    }
}
