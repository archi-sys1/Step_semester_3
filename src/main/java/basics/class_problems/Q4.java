package src.main.java.basics.class_problems;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().replaceAll("[\\[\\],]", " ");
        String[] values = line.trim().split("\\s+");

        int[] arr = new int[values.length];

        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(values[i]);

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}