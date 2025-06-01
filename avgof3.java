import java.util.Scanner;

public class avgof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.err.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.print("Average of three numbers is ");
        System.out.println(avg);
    }
    
}
