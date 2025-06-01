import java.util.*;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        Float r = sc.nextFloat();
        Float area = 3.14F * r * r;
        System.out.print("Area of circle: ");
        System.out.print(area);

    }
    
}
