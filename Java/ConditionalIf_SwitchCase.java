import java.util.Scanner;

public class ConditionalIf_SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the First Number:");
        int x = input.nextInt();
        System.out.println("Please Enter the first number:");
        int y = input.nextInt();

        System.out.println("Please choose your operation 1 for addition, 2 for substraction, & 3 for multiplication");
        int choice = input.nextInt();
/*
        if (choice==1)
            System.out.println("The addition is:" +(x+y));
        else if (choice==2)
            System.out.println("The subtraction is:" + (x-y));
        else if (choice==3)
            System.out.println("The multiplication is:" + (x*y));
        else
            System.out.println("Wrong choice");
*/
        switch (choice) {
            case 1:
                System.out.println("The addition is:" + (x + y));
                break;
            case 2:
                System.out.println("The subtraction is:" + (x - y));
                break;
            case 3:
                System.out.println("The multiplication is:" + (x * y));
                break;
            default:
                System.out.println("Wrong choice");

        }
    }
}
