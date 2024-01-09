import java.util.Scanner;
class number {
    public static void main(String[] args) {
        int num1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num1=s.nextInt();
        for(int i=1;i<num1;i++)
        {
        System.out.println(+i);
        }
    }
}