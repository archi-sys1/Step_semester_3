package src.main.java.basics.class_problems;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().replaceAll("[\\[\\],]", " ");
        String[] values = line.trim().split("\\s+");

        int even = 0, odd = 0;

        for (String value : values) {
            int num = Integer.parseInt(value);

            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        sc.close();
    }
}