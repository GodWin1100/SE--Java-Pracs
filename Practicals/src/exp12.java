import java.util.*;
import java.lang.*;

//User Define Exception
public class exp12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.print("Enter Dividend : ");
        i=sc.nextInt();
        System.out.print("Enter Divisor : ");
        j=sc.nextInt();
        if(j==0)
        {
            try {
                throw (new user(i));
            } catch (user u) {
                System.out.println("Error : " + u.getMessage());
            }
        }
        else
            System.out.println("Answer : "+i/j);
    }
}

class user extends Exception
{
    user(int ans)
    {
        super(ans+" Can't be Divided as Divisor is 0");
    }
}
