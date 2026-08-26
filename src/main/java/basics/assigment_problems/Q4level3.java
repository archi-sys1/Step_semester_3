package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.Scanner;
public class Q4level3 {
    static void generateFirstValidTable(int[] candidates) {

        for (int i = 0; i < candidates.length; i++) {

            if (candidates[i] < 1) {
                System.out.println("Skipping invalid number: " + candidates[i]);
                continue;
            }

            for (int j = 1; j <= 10; j++) {
                System.out.println(candidates[i] + " x " + j + " = " + (candidates[i] * j));
            }

            break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] candidates = new int[4];

        System.out.println("Enter 4 candidate numbers:");

        for (int i = 0; i < candidates.length; i++) {
            candidates[i] = sc.nextInt();
        }

        generateFirstValidTable(candidates);

        sc.close();
    }
}





    