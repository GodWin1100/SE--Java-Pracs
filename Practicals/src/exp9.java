import java.util.*;
import java.lang.*;

//Basic Vector Operations
public class exp9
{
    public static void main(String args[])
    {
        Vector vect=new Vector();
        int[] arr=new int[5];
        System.out.println("Initial size of Vector : "+vect.size());
        vect.add("hello");
        vect.add("bye");
        vect.add(5);
        vect.add(64.25);
        vect.add("done for now");
        String tsk="what now";
        System.out.println("Elements in Vector : "+vect);
        System.out.println("Capacity of Vector : "+vect.capacity());
        System.out.println("Current size of Vector : "+vect.size());
        System.out.println("First element in Vector : "+vect.firstElement());
        System.out.println("Last element in Vector : "+vect.lastElement());
        System.out.println("Element at index 5 : "+vect.indexOf(5));
        System.out.println("indexOf bye : "+vect.indexOf("bye"));
        System.out.println("indexOf bye after index 2 : "+vect.indexOf("bye",2));
        vect.addElement(tsk);
        System.out.println("Elements in Vector : "+vect);
        vect.add(4,"wth?");
        System.out.println("Elements in Vector after adding at index 4 : "+vect);
        vect.remove("done for now");
        System.out.println("After removing element : "+vect);
        vect.remove(3);
        System.out.println("Removing element by index : "+vect);
        vect.removeAllElements();
        System.out.println("size of vector after removing all elements : "+vect.size());
        System.out.println("Final display of vector : "+vect);
    }
}
