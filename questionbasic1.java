// Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.Scanner;

public class questionbasic1 {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost of Pencil: ");
        float a = sc.nextFloat();
        System.out.print("Enter the Cost of pen: ");
        float b = sc.nextFloat();
        System.out.print("Enter the Cost of Eraser: ");
        float c = sc.nextFloat();
        float cost = a + b+ c;
        float tc = cost + (cost * 0.18f);
        System.out.printf("Cost of all items: %.2f \n", cost);
       
        System.out.printf("Total Cost after GST: %.2f \n", tc);
        


    }
}
