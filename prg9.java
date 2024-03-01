import java.util.*;
public class prg9 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int nums[] =  new int[n];
        for(int i = 0;i< nums.length;i++)
        {
            nums[i] =  sc.nextInt();
        }

        System.out.println(majority(nums));

    }

    public static int majority(int[] nums)
    {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[n/2];

        return n;
    }


}
