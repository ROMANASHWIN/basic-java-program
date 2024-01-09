
import java.util.Scanner;
class prime {
    public static void main(String[] args)
    {
       int n,i,flag=0;
       Scanner s=new Scanner(System.in);
     System.out.println("Enter the No:");
     n=s.nextInt();
        for (i=2;i<n;i++)
    {
        if(n%i!=0)
        continue;
        else
        {
            flag=1;
           System.out.println("Non prime");
            break;
        }
    }
    if(flag==0)
    {
       System.out.println("Prime");
    }
    }
}