
import java.util.Scanner;
class area {
    public static void main(String[] args) 
    {
        
       int length,breadth,area,perimeter ;
        Scanner s=new Scanner(System.in);
        System.out.println("AREA AND PERIMETER OF RECTANGLE....");
        System.out.print("Enter the Length Value:");
        length=s.nextInt();
        System.out.print("Enter the Breadth Value:");
        breadth=s.nextInt();
        area=2*(length*breadth);
        System.out.println("The area of rectangle value is :"+area);
        perimeter=length*breadth;
        System.out.println("The Perimeter of rectangle value is :"+perimeter);

    }
}