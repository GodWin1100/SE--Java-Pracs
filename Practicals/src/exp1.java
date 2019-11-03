import java.io.*;
import java.util.*;
import java.lang.*;

//Different Input Method
public class exp1
{
    public static void main(String args[]) throws IOException
    {
        //Scanner
        int power=0,n,ans,result=0;
        System.out.println("\n###Armstrong Number with Scanner###\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check for Armstrong : ");
        n=sc.nextInt();
        int temp=n;
        while(temp>0)
        {
            power=power+1;
            temp=temp/10;
        }
        int mod=n;
        while(mod>0)
        {
            ans=mod%10;
            result= (int) (result+Math.pow(ans,power));
            mod=mod/10;
        }
        if(n==result)
            System.out.println("Entered Number is Armstrong");
        else
            System.out.println("Entered Number is Not Armstrong");

        //DataInputStream
        System.out.println("\n###Reverse of Given Number with DataInputStream###\n");
        DataInputStream dis=new DataInputStream(System.in);
        System.out.print("Enter Number to Reverse it and display : ");
        n=Integer.parseInt(dis.readLine());
        temp=n;
        result=0;
        while(temp>0)
        {
            result=temp%10+result*10;
            temp=temp/10;
        }
        System.out.println("Reverse of Number is : "+result);

        //BufferedReader
        System.out.println("\n###Fibonacci Series with BufferedReader###\n");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of elements in fibonacci series : ");
        n=Integer.parseInt(br.readLine());
        int a=0,b=1,c;
        System.out.print(a+"\t"+b);
        while(n-2>0)
        {
            c=a+b;
            System.out.print("\t"+c);
            a=b;
            b=c;
            n=n-1;
        }

        /*
        NOT WORKING just COPY PASTE FROM LAB MANUAL
        //Common Line Input
        System.out.println("\n###Greatest Among Three with Common Line Input###\n");
        System.out.print("Enter Three Numbers : ");
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        if(a>b && b>c)
            System.out.println(a+" is Greatest Among "+b+" and "+c);
        else if(b>c)
            System.out.println(b+" is Greatest Among "+a+" and "+c);
        else
            System.out.println(c+" is Greatest Among "+a+" and "+b);
         */
    }
}
