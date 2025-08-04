import java.util.Scanner;

public class oops {

   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try{
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter Second Number:");
        int b=sc.nextInt();
        int result = a/b;
         System.out.println(result);
    }catch(ArithmeticException e){
        System.out.println("Arithmetic Exception: Cannot divide by zero.");
    }finally{
        sc.close();
        System.out.println("\nProgram ended successfully.");

    }
}

}