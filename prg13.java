import java.io.*;
import java.util.*;

public class prg13 {

    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] =  new int[n];

        for(int i = 0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }

        System.out.println(remove(nums));
    }

    public static int remove(int[] nums)
    {
        int j = 1;
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
