import java.util.*;
import java.lang.*;

//Inheritance
public class exp10
{
    public static void main(String args[])
    {
    Root r=new Root();
    r.life();
    System.out.println();
    Stem s=new Stem();
    s.nature();
    }
}

class Root
{
    String genes="Adam";
    void life()
    {
        System.out.println("Currently Flourishing...");
        System.out.println("Genes are : "+genes);
    }
    Root()
    {
        System.out.println("Direct Descendant of God");
    }
}

class Stem extends Root
{
    String genes="Demi-Gods";
    void nature()
    {
        System.out.println("Charles Darwin Theory Explained");
        super.life();
        life();
    }
    void life()
    {
        System.out.println("Assumed Godly genes are of "+genes+" while ancestor genes are of "+super.genes);
    }
    Stem()
    {
        super();
        System.out.println("Second era is of Descendant of Demi-Gods");
    }
}

