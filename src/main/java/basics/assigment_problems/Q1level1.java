package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.Scanner;

public class Q1level1{
    static void checkVotingEligibility(int age){
    if(age>=18){
            System.out.println("Eligible to vote.");
        }
    else{
        System.out.println("Not eligible to vote");
    }
}
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        checkVotingEligibility(age);
        sc.close();
    }
        
}
