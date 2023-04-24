package week.day1;

public class OnePlus {

	public void batteryStatus() {

		System.out.println("Battery Status");
	}
	
	public String getModelName() {
		
		return "9VM";
	}
	
	public int getLaunchYear() {
		
		return 2023;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnePlus mbl=new OnePlus();
		mbl.batteryStatus();
		
		
		/*
		 * String modelName=mbl.getModelName(); System.out.println(modelName);
		 */
		
		//Ctrl+2 L
		int launchYear=mbl.getLaunchYear();
		System.out.println(launchYear);
		

	}

}
