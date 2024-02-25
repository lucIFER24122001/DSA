
// TWO SUM PROBLEM
import java.util.*;

public class prg2 {

    public static void main(String args[])
    {
      Scanner sc =  new Scanner(System.in);
      System.out.println("Enter the target");
      int target = sc.nextInt();
      System.out.println("Enter the number");
      int n = sc.nextInt();
      int arr[] =  new int[n];
        System.out.println("Enter the number in array");
      for(int i = 0 ;i<n;i++)
      {
          arr[i] = sc.nextInt();
      }
        int[] result =  twosum(arr, target); // storing result in an array
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two elements sum up to the target.");
        }
      }

      public static int[] twosum(int[] arr, int target)
      {
          Hashtable<Integer, Integer> ht = new Hashtable<>();
          int comp;
          for(int i = 0;i<arr.length;i++)
          {
              comp = target - arr[i];
              if(ht.containsKey(comp))
              {
                  return new int[]{ht.get(comp),i};
              }
              ht.put(arr[i],i);

          }

          return null;
      }
    }


