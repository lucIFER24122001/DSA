import java.util.*;

public class prg5 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int k = 0;
        for(int i = 0;i< nums.length;i++)  // positioning the non-zero element
        {
            if(nums[i] != 0)
            {
                nums[k] = nums[i];
                k++;
            }
        }

        for(int i = k ;i< nums.length;i++)  // positioning the zero element
        {
            nums[i] = 0;
        }
        for(int i = 0;i< nums.length;i++)
        {
            System.out.println(nums[i]);
        }


    }

}
