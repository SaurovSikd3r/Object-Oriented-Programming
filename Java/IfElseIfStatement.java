import java.util.Scanner;

public class IfElseIfStatement {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Salary:");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary > 0 && salary < 4000)
        System.out.println("Your salary will not have any reductions");
        else if (salary >= 4000 && salary < 6000)
        System.out.println("You will get a tax of 10%");
        else if (salary > 6000)
        System.out.println("You will get a 20% tax");
        else
            System.out.println("This is an invalid for salary, please enter a valid value that is greater than 0");

        input.close();
    }
}
