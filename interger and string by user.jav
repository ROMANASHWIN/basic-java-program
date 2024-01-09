import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int a;
        String s;
        
      Scanner obj = new Scanner(System.in); 
      System.out.println("Enter a string:");
      s = obj.nextLine(); 
      System.out.println("Enter a num:");
      a = obj.nextInt();
      System.out.println("You entered string ;\n"+a);
      System.out.println("You entered string :"+s);
    }
}