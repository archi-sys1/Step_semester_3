package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.Scanner;
public class Q3level1 {
    static void printNumbersUpToN(int n){
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int n=sc.nextInt();
        printNumbersUpToN(n);
        sc.close();
    }
}
