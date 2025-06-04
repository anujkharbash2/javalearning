import java.util.*;

public class ArithmeticOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int product = a * b;
        int div = (b != 0) ? a / b : 0;
        int mod = (b != 0) ? a % b : 0;

        // Unary operations
        int newa = ++a;
        int newb = --b;

        System.out.println("All Binary Arithmetic operations:");
        System.out.printf("Sum a + b is %d\n", sum);
        System.out.printf("Subtraction a - b is %d\n", sub);
        System.out.printf("Product a x b is %d\n", product);
        System.out.printf("Division a / b is %d\n", div);
        System.out.printf("Modulo a %% b is %d\n", mod);

        System.out.println("Unary Arithmetic operations:");
        System.out.printf("++a is %d\n", newa);
        System.out.printf("--b is %d\n", newb);
    }
}