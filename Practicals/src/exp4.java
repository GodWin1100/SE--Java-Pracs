import java.util.*;
import java.lang.*;

//method overloading
public class exp4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Polygon s=new Polygon();
        System.out.print("Enter Radius of Circle : ");
        Double r=sc.nextDouble();
        s.area(r);
        System.out.print("Enter Length of Square : ");
        int ss=sc.nextInt();
        s.area(ss);
        System.out.print("Enter Lenght : ");
        int l=sc.nextInt();
        System.out.print("Enter Breadth : ");
        int b=sc.nextInt();
        s.area(l,b);
        s.area();
    }
}

class Polygon
{
    void area(Double r)
    {
        System.out.println("Area of Circle : "+r*r*3.14);
    }

    void area(int l)
    {
        System.out.println("Area of Square : "+l*l);
    }

    void area(int l, int b)
    {
        System.out.println("Area of Rectangle : "+l*b);
    }

    void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=sc.nextLine();
        System.out.println(name+" is Passed with Distinction...");
    }
}
