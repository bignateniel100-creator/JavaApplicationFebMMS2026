public class InstanceMethod{
	public static void main(String[] args){
		InstanceMethod obj1 = new InstanceMethod();
		obj1.clap("Precious", "Female");
		InstanceMethod obj2 = new InstanceMethod();
		obj2.clap("Nathaniel", "Male");
	}
	public void clap(String name,String gender){
		if(gender.equals("Male")){
		
		System.out.println(name+" is clapping his hands");
	}
	else{
		System.out.println(name+" is clapping her hands");
		}
	} 
}