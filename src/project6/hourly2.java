package project6;
//Definition of object from string type and double type
public class hourly2 {
	private String firstName;
	private String lasttName;
	private double contractor;
	private double employee;

	/**
	 * 
	 */
	public hourly2() {
		this.firstName = "emad";
		this.lasttName = "hassan";
		this.contractor = 10;
		this.employee = 50;
	}

	/**
	 * @param firstName
	 * @param lasttName
	 * @param contractor
	 * @param employee
	 */
	
	//A value is given to each object
	public hourly2(String firstName, String lasttName, double contractor, double employee) {
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.contractor = contractor;
		this.employee = employee;
	}

	/**
	 * @return the firstName
	 */
	
	//The get was used to take the value that would be given to it
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lasttName
	 */
	public String getLasttName() {
		return lasttName;
	}

	/**
	 * @param lasttName the lasttName to set
	 */
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return contractor;
	}

	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double contractor) {
		this.contractor = contractor;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setSalary(double salary) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("hourly2 [firstName=");
		builder.append(firstName);
		builder.append(", lasttName=");
		builder.append(lasttName);
		builder.append(", contractor=");
		builder.append(contractor);
		builder.append(", employee=");
		builder.append(employee);
		builder.append("]");
		return builder.toString();
	}
	//The calculations are written that you will do the hourly work
	public double getpayment(int hours) {

		return this.contractor * hours;
	}

	//The calculations are written that you will do the work day
	public double getpayment2(int salary) {

		return this.employee * 30;
	}
}
