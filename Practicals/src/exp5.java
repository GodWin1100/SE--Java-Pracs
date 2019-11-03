import java.util.*;
import java.lang.*;

//passing object as argument and returning object
public class exp5
{
    public static void main(String args[])
    {
        passing p12=new passing();
        passing p=new passing(20,40);
        passing p1=new passing(p12);
        returning s = null;
        returning s2=new returning();
        s=s2.trial(s);
        System.out.println(s.name+" < this is in main");
    }
}

class passing
{
    int length=50,breadth=100;
    passing(int l,int b)
    {
        length=l;
        breadth=b;
        System.out.println(l+" : length\n"+b+" : breadth");
    }
    passing()
    {
        System.out.println(length+" : initial length\n"+breadth+" : initial breadth");
    }
    passing(passing p)
    {
        System.out.println(p.length+" : initial length\n"+p.breadth+": initial breadth");
    }
}

class returning
{
    String name="Practical";
    returning trial(returning r)
    {
        returning k=new returning();
        return k;
    }
}
