package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.*;

class A4 {
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of array element: ");
        int n= sc.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<nums.length;i++){
            System.out.println("Enter array element: ");
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        System.out.println(A4.subarraySum(nums, k));
        sc.close();
    }
}
