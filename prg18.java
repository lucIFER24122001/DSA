import java.util.*;
public class prg18 {

    public static  void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int nums1[] =  new int[n];
        int nums2[] = new int[m];

        for(int i = 0;i<n;i++)
        {
            nums1[i] = sc.nextInt();
        }
        for(int j = 0;j<n;j++)
        {
            nums2[j] = sc.nextInt();
        }

        System.out.println(getCommon(nums1,nums2));

    }

    public static int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp =  new HashMap<>();
        for(int num : nums1)
        {
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int num : nums2)
        {
            if(mp.containsKey(num) && mp.get(num)>0)
            {
                return num;
            }
        }
        return -1;
    }
}
