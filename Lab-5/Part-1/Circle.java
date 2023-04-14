
package Lab_5_1;

import java.util.Scanner;

public class Circle extends Shape {

    @Override
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of radius:");
        float radius = scanner.nextFloat();
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("Area of Circle is " + area);
    }


}
