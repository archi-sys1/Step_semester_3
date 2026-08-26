package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.Scanner;
public class Q1level3 {
    static void printNumberPyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }


    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int n= sc.nextInt();
        printNumberPyramid(n);
        sc.close();
    }
}
