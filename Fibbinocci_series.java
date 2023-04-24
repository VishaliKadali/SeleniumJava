package week.day1;

public class Fibbinocci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum=0, secNum=1, sum;
		
		System.out.println(" First Number: " +firstNum);
		
		for(int i=2;i<=11;i++) {
			
			sum=firstNum+secNum;
			
			firstNum=secNum;
			
			secNum=sum;
			
			System.out.println( +sum);
		}
		
		
		
	}

}
