package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.Scanner;
public class Q5level2 {
    static void checkPrime(int number){
        boolean isPrime=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
            
        }
        if(isPrime==true){
            System.out.println("Is the number "+number+" a prime. "+ isPrime);
        }
        else if(number==1){
            System.out.println("The number "+number+" is neither prime nor composite.");
        }
        else{
            System.out.println("Is the number "+number+" a prime. "+isPrime);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number=sc.nextInt();
        checkPrime(number);
        sc.close();
    }
}
