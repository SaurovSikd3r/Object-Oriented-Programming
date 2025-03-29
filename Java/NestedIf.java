public class NestedIf {
    public static void main(String[] args) {
        int age = -3;
        if (age > 0) {
            if (age > 18) {
            System.out.println("Welcome to the website");
        }
            else
            System.out.println("You are not eligible to register");
            }
        else
            System.out.println("Invalid value for age");
    }
}