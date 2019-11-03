import java.lang.*;
import java.util.*;

import static java.lang.Thread.sleep;

public class exp13
{
    public static void main(String args[])
    {
        num n=new num();
        n.start();
        try
        {
            sleep(3000);
            alpha a = new alpha();
            a.start();
        }
        catch(Exception e)
        {}
    }
}

class num extends Thread
{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print(i+"\t");
    }
}

class alpha extends Thread
{
    public void run()
    {
        char z;
        System.out.println();
        for(z='A';z<='Z';z++)
            System.out.print(z+"\t");
    }
}
