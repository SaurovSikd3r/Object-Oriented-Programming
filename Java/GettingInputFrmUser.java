import java.util.Scanner;

public class GettingInputFrmUser {
    public static void main(String[] args) {


        //1.Initialize what we know
        int assignment_total = 40;
        int exam_total = 200;
        int assignment_grade;
        int exam_grade;


        //2.Get input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your assignments grade:");
        assignment_grade = input.nextInt();

        System.out.println("Please enter your final exam grade:");
        exam_grade = input.nextInt();


        //3.Do some processing
        int student_grade = assignment_grade + exam_grade;
        int total = assignment_total + exam_total;
        float percentage = (float) student_grade/total * 100;

        //4.Print output

        System.out.println("Your Total Grade is:" + student_grade);
        System.out.println("Your percentage is:" + percentage);
    }
}
