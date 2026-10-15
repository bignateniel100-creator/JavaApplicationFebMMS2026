public class EvenOddCheck{
	public static void main(String[] args){
		for(int e=1; e<=100;e++){
			if(e%2==0){
				System.out.printf("%d is an even number.%n",e);
			}
		}
		
		System.out.println("---End of Even Numbers----------/n");
	
		for(int o=1; o<=100;o++){
			if(o%2!=0){
				System.out.printf("%d is an odd number.%n",o);
			}
	
		}
		System.out.println("---End of Odd Numbers----------/n");
	}
}