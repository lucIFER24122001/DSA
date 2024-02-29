import java.util.*;
public class prg8 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int nums[] =  new int[n];
        for(int i = 0;i< nums.length;i++)
        {
            nums[i] =  sc.nextInt();
        }

        System.out.println(pivotindex(nums));
    }

    private static int pivotindex(int[] nums) {
        int total  = 0;
        int left = 0;
        int ans = 0;
        for( int i = 0;i< nums.length;i++)
        {
            total += nums[i];
        }

        int right  = total;
        for(int i = 0;i< nums.length;i++ )
        {
            right  -= nums[i];
            if(right == left)
            {
                 ans = i;
            }
            left += nums[i];
        }


        return ans;

    }


}
