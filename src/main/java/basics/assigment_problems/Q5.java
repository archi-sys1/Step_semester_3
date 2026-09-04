package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.*;
class A5 {
    static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of array element: ");
        int n= sc.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<nums.length;i++){
            System.out.println("Enter array element: ");
            nums[i]=sc.nextInt();
        }
        System.out.println(A5.findMin(nums));
        sc.close();
    }

}
