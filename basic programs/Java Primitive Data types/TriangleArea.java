import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double height = input.nextDouble();

        
        double areaInInches = 0.5 * base * height;

        
        double areaInCm = areaInInches * 2.54 * 2.54;

    
        System.out.println("Area of the triangle in square inches = " + areaInInches);
        System.out.println("Area of the triangle in square centimeters = " + areaInCm);

        input.close();
    }
}
