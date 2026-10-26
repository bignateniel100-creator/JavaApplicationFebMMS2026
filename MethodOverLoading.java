import java.util.Scanner;
public class MethodOverLoading{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("===============================================");
		System.out.println(" CALCULATE	PERIMETER OF A SHAPE	");
		System.out.println("===============================================/n");
		System.out.println("ENTER 1. CIRCLE");
		System.out.println("ENTER 2. SQUARE");
		System.out.println("ENTER 3. RECTANGLE");
		System.out.println("===============================================/n");
		System.out.println("ENTER your choice");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1: 
				System.out.print("Enter Radius");
				double r = scan.nextDouble();
				
				System.out.printf("Perimeter of Circle is %.2f%n,",shape(r));
				
			break;
			
			case 2: 
				
				System.out.print("Enter Length of the square");
				int l = scan.nextInt();
				
				System.out.printf("Perimeter of Square %d%n,",shape(l));
			break;
			
			case 3: 
				
				System.out.print("Enter length of the rectangle");
				int length = scan.nextInt();
				
				System.out.print("Enter breadth of the rectangle");
				int breadth = scan.nextInt();
				
				System.out.printf("Perimeter of rectangle is %d%n,",shape(length,breadth));
			break;
			
			default:
			System.out.print("Good Bye");
			
			
		}
		
	}
	public static double shape(double r){
		double perimeter = 2*Math.PI*r;
		
		return perimeter;
	}
		public static int shape(int l){
		int perimeter =4*l; 
		
		return perimeter;
	}
	public static int shape(int length, int breadth){
		int perimeter =2*(length+breadth);
		
		return perimeter;
	}
		
	}
