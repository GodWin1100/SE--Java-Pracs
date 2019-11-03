import java.lang.*;
import java.util.*;

//Operation on 1D and 2D array
public class exp7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //sorting of array
        int[] sort= new int[10];
        System.out.print("Enter 10 elements in array : ");
        for(int i=0;i<10;i++)
        {
            sort[i]=sc.nextInt();
        }
        System.out.print("Entered array : ");
        for(int i=0;i<10;i++)
        {
            System.out.print(sort[i]+"  ");
        }
        System.out.print("\nSorted array : ");
        int temp;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10-i-1;j++)
            {
                if(sort[j]>sort[j+1])
                {
                    temp=sort[j];
                    sort[j]=sort[j+1];
                    sort[j+1]=temp;
                }
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(sort[i]+"  ");
        }

        /*
        Arrays.sort(sort); //direct function for sorting array

        for(int s:sort)  //for printing array
            System.out.println(s);
        */

        //multiplication of 3x3 matrix
        System.out.println("\n\n\nMultiplication of 2 Matrix");
        int[][] a=new int[3][3],b=new int[3][3],c=new int[3][3];
        System.out.println("\nEnter Elemnt of Matrix A ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nMatrix A");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nEnter Elemnt of Matrix B ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nMatrix B");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n\nMultiplication of Matrix A and Matrix B");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                    c[i][j]=a[i][k]*b[k][j]+c[i][j];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

}
