import java.util.*;


public class prg4 {

    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("nums1 size");
        int n =  sc.nextInt();
        System.out.println("nums2 size");
        int m = sc.nextInt();
        int nums1[] =  new int[n];
        int nums2[] =  new int[m];
        System.out.println("Enter the nums1 element");
        for(int i = 0;i<n;i++)
        {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter the nums2 element");
        for(int j=0;j<m;j++)
        {
            nums2[j] = sc.nextInt();
        }

        System.out.println(Arrays.toString(merges(nums1, n, nums2, m)));
    }

    public static int[] merges(int[] nums1, int n, int[] nums2, int m)
    {
        int i = m-1;
        int j = n-1;
        int k =  m+n-1;

        while(j >=0)
        {
            if(i>=0 && nums1[i] > nums2[j])   // It comparing backwards {1,2,3}
            {                                 //{1,2,3} = {3,3,2,2,1,1}
                nums1[k--] = nums1[i--];
            }
            else
            {
                nums1[k--] = nums2[j--];
            }
        }
        return nums1;

    }
}
