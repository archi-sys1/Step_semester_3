package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.Scanner;

public class Q2level3 {

    static void atmPinRetry(String correctPin, String[] attempts) {
        int i = 0;
        boolean flag = false;

        while (i < attempts.length && flag == false) {

            if (correctPin.equals(attempts[i])) {
                flag = true;
                System.out.println("PIN accepted");
                break;
            }

            i++;
        }

        if (flag == false) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] attempts = new String[3];

        System.out.println("Enter the correct PIN:");
        String correctPin = sc.nextLine();

        System.out.println("Enter first combination:");
        attempts[0] = sc.nextLine();

        System.out.println("Enter second combination:");
        attempts[1] = sc.nextLine();

        System.out.println("Enter third combination:");
        attempts[2] = sc.nextLine();

        atmPinRetry(correctPin, attempts);

        sc.close();
    }
}