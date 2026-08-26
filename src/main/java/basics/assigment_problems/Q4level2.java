package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.Scanner;
public class Q4level2 {
    static void calculate(double a, double b, char operator){
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;

            case '-':
                System.out.println("Result: " + (a - b));
                break;

            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } 
                else {
                    System.out.println("Result: " + (a / b));
                }
                break;

            default:
                System.out.println("Invalid operator");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value:");
        double a=sc.nextDouble();

        System.out.println("Enter second value:");
        double b=sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        calculate(a, b, operator);
        sc.close();
    }

}
