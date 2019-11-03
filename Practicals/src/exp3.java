import java.util.*;
import java.lang.*;

//Constructor overloading
public class exp3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        Double r=sc.nextDouble();
        Shape s0=new Shape(r);
        System.out.print("Enter Length of Square : ");
        int ss=sc.nextInt();
        Shape s1=new Shape(ss);
        System.out.print("Enter Length : ");
        int l=sc.nextInt();
        System.out.print("Enter Breadth : ");
        int b=sc.nextInt();
        Shape s2=new Shape(l,b);
        Shape s3=new Shape();
    }
}

class Shape
{
    Shape(Double r)
    {
        System.out.println("Area of Circle : "+r*r*3.14);
    }

    Shape(int l)
    {
        System.out.println("Area of Square : "+l*l);
    }

    Shape(int l, int b)
    {
        System.out.println("Area of Rectangle : "+l*b);
    }

    Shape()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=sc.nextLine();
        System.out.println(name+" is Passed with Distinction...");
    }
}

