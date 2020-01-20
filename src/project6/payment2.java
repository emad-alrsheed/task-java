package project6;

public class payment2 {
//This method calculates the hourly fare
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Objec invokes the class hourly2 and prints it
		hourly2 hourly2 = new hourly2();
		hourly2.setFirstName("emad");
		hourly2.setLasttName("hasan");
		hourly2.setHourlyRate(10);
		
		
		//It prints the results

		System.out.println(hourly2.toString());

		System.out.println(hourly2.getpayment(40));

	}

}
