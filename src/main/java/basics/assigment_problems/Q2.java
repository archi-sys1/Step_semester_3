package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.*;
class A2{
    static int maxSubArray(int[] nums){
        int current = nums[0];
        int maximum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            maximum = Math.max(maximum, current);
        }

        return maximum;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of array element: ");
        int n= sc.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<nums.length;i++){
            System.out.println("Enter array element: ");
            nums[i]=sc.nextInt();
        }
        System.out.println(A2.maxSubArray(nums));
        sc.close();
    }
}
