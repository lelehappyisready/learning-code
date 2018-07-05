package toBinary;

public class toBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		toBinary(18);
		
	}
	public static void toBinary(int num) {
		if(num==0)
			return;
		
		toBinary(num/2);
		System.out.print(num%2);
		
		
		
	}
	
	
	
}
