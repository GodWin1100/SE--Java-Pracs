import java.util.*;
import java.lang.*;

//Basic of Method
public class exp2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        System.out.print("Enter Your Name : ");
        String n=sc.nextLine();
        s.name(n);
        System.out.print("Enter Your Age : ");
        int a=sc.nextInt();
        sc.nextLine();
        s.age(a);
        System.out.print("Enter Your College : ");
        String c=sc.nextLine();
        s.college(c);
        System.out.print("Enter Your Roll No. : ");
        int rn=sc.nextInt();
        s.roll(rn);
        System.out.println("\nStudent Details");
        s.display();
    }
}

class Student
{
    String sname,scollege;
    int sage,sroll;
   void name(String n)
   {
       sname=n;
   }
   void roll(int rn)
   {
       sroll=rn;
   }
   void college(String c)
   {
       scollege=c;
   }
   void age(int a)
   {
       sage=a;
   }
   void display()
   {
       System.out.println("Name : "+sname+"\nAge : "+sage+"\nCollege : "+scollege+"\nRoll No. : "+sroll);
   }

}
