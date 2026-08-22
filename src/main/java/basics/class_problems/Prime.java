package Step_semester_3.src.main.java.basics.class_problems;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
            
        }
        if(isPrime==true){
            System.out.println("Is the number "+n+" a prime. Yes");
        }
        else if(n==1){
            System.out.println("The number "+n+" is neither prime nor composite.");
        }
        else{
            System.out.println("Is the number "+n+" a prime. No");
        }
        sc.close();

    }
    
}
