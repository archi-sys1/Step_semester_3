package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.Scanner;
public class Q2level2 {
    static void simulateLogin(String correctCode, String[] attempts){
        for(int i=0;i<attempts.length;i++){
            if(correctCode.equals(attempts[i])){
                System.out.println("Access granted on attempt " +(i+1));
                return;
            }
        }
        System.out.println("Access denied all attempts used.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] attempts= new String[3];
        System.out.println("Enter the correct code:");
        String correctCode= sc.nextLine();

        System.out.println("Enter first combination:");
        attempts[0]=sc.nextLine();

        System.out.println("Enter second combination:");
        attempts[1]=sc.nextLine();

        System.out.println("Enter third combination:");
        attempts[2]=sc.nextLine();

        simulateLogin(correctCode,attempts);
        sc.close();
    }

}
