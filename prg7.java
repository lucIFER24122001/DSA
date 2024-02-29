import java.util.*;
public class prg7 {

    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int n =  sc.nextInt();
        int  arr[] =  new int[n];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] =  sc.nextInt();
        }

        System.out.println(Arrays.toString(running_sum(arr)));
    }

// [1,2,3,4] = [1,3,6,10]
    public static int[] running_sum(int[] arr)
    {
      for(int i = 1;i<arr.length;i++)
      {


              arr[i] = arr[i-1] + arr[i];


      }

      return arr;
    }
}
