import java.util.Scanner;

public class areaofsquare {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.err.print("Enter side a: ");
        int a = sc.nextInt();
        
        double areaofsquare = a*a;
        System.out.print("Average of Square is ");
        System.out.println(areaofsquare);
    }
    
}
