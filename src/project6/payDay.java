package project6;

public class payDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//He invokes the Objet from Class hourly2
			hourly2 hourly2 = new hourly2();
			hourly2.setFirstName("emad");
			hourly2.setLasttName("hasan");
			hourly2.setSalary(10);
			
			//You print results for a salary calculation over thirty days
			
			System.out.println(hourly2.toString());

			System.out.println(hourly2.getpayment2(30));

		


	}

}
