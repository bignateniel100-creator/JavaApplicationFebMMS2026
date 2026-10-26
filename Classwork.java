public class Classwork{
	public static void main(String[] args){
		checkAge(26);
		checkAge(17);
		checkAge(18);
		checkAge(21);
		checkAge(30);
		checkAge(15);
		checkAge(27);
		
		
	}
	public static void checkAge(int age){
		
		if(age>=18)
		{
		System.out.println("You are an adult");
		
		}
		else
		{
			System.out.println("You are a minor");
		}
	}

	
}
