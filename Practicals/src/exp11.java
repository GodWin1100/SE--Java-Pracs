import java.util.*;
import java.lang.*;

//Interface
public class exp11
{
    public static void main(String args[])
    {
        GetResult gr=new GetResult();
        gr.display();
    }
}

class student
{
    Scanner sc=new Scanner(System.in);
    void name()
    {
        System.out.print("Enter your name : ");
        String fname=sc.nextLine();
    }
    void id()
    {
        System.out.print("Enter your ID : ");
        int id=sc.nextInt();
    }
}

interface Result
{
    void verdict(int mm,int sm);
}

abstract class OpenDay extends student implements Result
{
    void info()
    {
        name();
        id();
        System.out.print("Enter marks of Maths : ");
        int mm=sc.nextInt();
        System.out.print("Enter marks of Science : ");
        int sm=sc.nextInt();
        this.verdict(mm,sm);
    }
    public void verdict(int mm, int sm)
    {
        if(mm>35 && sm >35)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}

class GetResult extends OpenDay
{
    public void display()
    {
        super.info();
    }
}