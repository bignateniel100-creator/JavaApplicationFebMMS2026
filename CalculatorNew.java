import java.util.Scanner;
public class CalculatorNew{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first number");
		int num1 = input.nextInt();
		
		System.out.print("Enter secomd number");
		int num2 = input.nextInt();
		
		System.out.print("Enter desired symbol");
		char symbol = input.next().charAt(0);
		
		switch(symbol)
		{
			case'+':
			int addition = num1 + num2;
			
				System.out.printf("%d + %d: %d",num1,num2, addition);
			break;
			case '-':
			int subtraction = num1 - num2;
			
				System.out.printf("%d - %d: %d", num1, num2, subtraction);
			break;
			
			case '*':
			int multiplication = num1 * num2;
		
				System.out.printf("%d * %d: %d", num1, num2, multiplication);
			break;
			
			case '/':
			int division = num1 / num2;
			
				System.out.printf("%d / %d: %d", num1, num2, division);
			break;
			
				
		}
		
		
	}
}