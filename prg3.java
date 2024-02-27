import java.util.*;

public class prg3 {

    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] =  new int[n];

        for(int i = 0;i<n;i++)
        {
            prices[i] = sc.nextInt();
        }

        System.out.println(maxprofit(prices));

    }

    public static int maxprofit(int[] prices)
    {
        int low = Integer.MAX_VALUE;
        int high = 0;
        int op = 0;
        for(int i = 0;i<prices.length;i++) {
            if (prices[i] < low) {
                low = prices[i]; // first calculating the first low but prices
            }

            high = prices[i] - low; /* Then calculating each profit and finding the lowest profit */
            if (op < high) {
                op = high;
            }


        }
       return op;
    }
}
