import java.util.*;
import java.math.*;
public class prg11 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int nums[] = new int[n];
        for( int i = 0;i<nums.length;i++)
        {
             nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(square(nums)));
    }

    public static int[] square(int[] nums) // nums = [-4,-1,0,3,10];
    {

            int k = 0;
            for(int i = 0;i< nums.length;i++)
            {
                nums[k] = (int) Math.pow(Math.abs(nums[i]),2);
                k++;
            }
            Arrays.sort(nums);

            return nums;

    }

}
