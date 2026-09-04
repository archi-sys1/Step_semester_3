package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.*;
class A1{
    static int[] productExceptSelf(int[] nums){
        int m=nums.length;
        int[] answer=new int[m];
        int left=1,right=1;
        
        for (int i=0;i<m;i++){
            answer[i]=left;
            left*=nums[i];
        }
        for (int i=m-1;i>=0;i--){
            answer[i]*=right;
            right*=nums[i];
        }

        return answer;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of array element: ");
        int n= sc.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<nums.length;i++){
            System.out.println("Enter array element: ");
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(A1.productExceptSelf(nums)));
        sc.close();
    }
    
}
