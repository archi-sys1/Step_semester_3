package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.Scanner;
public class Q2level1 {
    static void classifyNumber(int number){
        if(number==0){
            System.out.println("ZERO");
        }
        else if(number>0){
            System.out.println("POSITIVE");
        }
        else{
            System.out.println("NEGATIVE");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int number=sc.nextInt();
        classifyNumber(number);
        sc.close();
    }
}
