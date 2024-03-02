import java.io.*;
import java.util.Scanner;


public class prg10 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();


        System.out.println(fib(n));
    }

    public static int fib(int n)
    {
        if(n == 1|| n == 2)
        {
            return 1;
        }
        if(n == 0)
        {
            return 0;
        }
        return fib(n-1)+fib(n-2);
    }



}
