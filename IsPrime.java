package week.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=9;
		
		int count=0;
		
		for(int i=2;i<=n-1;i++)
			
		{
			if(n%i==0) {
				
				count++;
				
			}
		}
		
		if(count==0) {
			
			System.out.println(n + " Is a prime number");
		}
		else {
			
			System.out.println(n + " is not a prime number");
		}

	}

}
