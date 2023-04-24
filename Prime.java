package week.day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=7;
		boolean bPrime=true;
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				
				System.out.println(+ num + " Is not a Prime Number");
				bPrime=false;
				break;
			}
		}

		
		if(bPrime==true) {
			
			System.out.println(+ num + " Is a Prime Number ");
		}
	}

}
