import java.util.Scanner;
public class Circle{
	public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the radius of the circle");
	int radius = scan.nextInt();
	
	int diameter = (2 * radius);
	double circumference = (2 * Math.PI * radius);
	double area = (2 * Math.PI * (radius^2));
	
	System.out.printf("Formular for diameter of a circle is 2*%d%d%n",radius,diameter);
	System.out.printf("Circumference = (2*Math.PI*%d%2f)",radius,circumference);
	System.out.printf("Area = (2*Math.PI*%d^2%2f)",radius,area);
	
	}
}