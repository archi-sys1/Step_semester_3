package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.Scanner;

public class Q4level1 {
    static int sumOfNaturalNumbers(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int n=sc.nextInt();
        System.out.println("The sum of the numbers upto "+ n+ " is: "+sumOfNaturalNumbers(n));
        sc.close();
    }
    
}
