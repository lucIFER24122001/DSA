import java.util.*;


public class prg6 {

    public static  void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int  price[] = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i = 0;i<n;i++)
        {
            price[i] = sc.nextInt();
        }

        System.out.println(maxprofit(price));
    }

    public static int maxprofit(int[] price)
    {
        int max = 0;
        for(int i = 1;i< price.length;i++)
        {
            if(price[i] > price[i-1])
            {
                max += (price[i] - price[i-1]);
            }
        }
        return max;
    }






}
