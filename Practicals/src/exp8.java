import java.lang.*;
import java.util.*;

//StringBuffer
public class exp8
{
    public static void main(String args[])
    {
        //Basic operation of StringBuffer
        StringBuffer str1=new StringBuffer("Guardian");
        StringBuffer str2=new StringBuffer("I am from Earth");
        System.out.println("Initial String 1 : "+str1+"\nInitial String 2 : "+str2);
        System.out.println("append string 1 with string 2 : "+str1.append(" ,"+str2));
        System.out.println("length of string 1 : "+str1.length());
        System.out.println("charAt 5 of string 1 : "+str1.charAt(5));
        System.out.println("reverse of string 1 : "+str1.reverse());
        System.out.println("delete of string 2 (10,16) : "+str2.delete(10,16));
        System.out.println("append string 2 with mars : "+str2.append("Mars"));
        System.out.println("deleteCharAt of string 2 at 2 : "+str2.deleteCharAt(2));
        System.out.println("capacity of string 1 : "+str1.capacity());
        System.out.println("indexOf of string 1 of Earth : "+str1.indexOf("Earth"));
        System.out.println("indexOf of string 1 of a : "+str1.indexOf("a"));
        System.out.println("indexOf of string 1 of a from index 5 : "+str1.indexOf("a",5));
        System.out.println("insert in string at index 0 : "+str1.insert(0,"SuperHero, "));
        System.out.println("replace in string 1 from index 9 to last : "+str1.replace(9,100,""));
        System.out.println("insert in string 2 at index 3 : "+str2.insert(3," "+str1));
        System.out.println("substring of string 2 from index 4 : "+str2.substring(4));
        System.out.println("Final String 1 : "+str1+"\nFinal String 2 : "+str2);

        //Palindrome
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\n\nEnter String to check whether its Pallindrome or not : ");
        String string1= new String("");
        String string2=new String("");
        string1=sc.nextLine();
        for(int i=string1.length()-1;i>=0;i--)
        {
            string2=string2+(string1.charAt(i));
        }
        if(string1.equals(string2))
        {
            System.out.println(string1+" is palindrome");
        }
        else
        {
            System.out.println(string1+" is not palindrome");
        }
    }
}
