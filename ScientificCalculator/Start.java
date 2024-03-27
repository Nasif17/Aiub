
import calculator.*;






import java.util.Scanner;




public class Start {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double v1;
        double v2;
        int n;
     System.out.print("Enter your first value:  ");
     v1 = input.nextDouble();

     System.out.print("Enter your Second Value:  ");
     v2 = input.nextDouble();

     System.out.println("Enter your to the power value : ");
     n = input.nextInt();

     ScientificCalculator scr = new ScientificCalculator(v1,v2);

     
     System.out.println(scr.add());
     System.out.println(scr.substact());
     System.out.println(scr.multiply());
     System.out.println(scr.divide());
     System.out.println(scr.toThePow());
     

    }
}