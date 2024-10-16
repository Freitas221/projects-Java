package entities;

public class Employee {

	private String name;
	private String email;
	private double salary;
	
	public Employee() {
	}

	public Employee(String name, String email, double salary) {
		this.name = name;
		this.email = email; 
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double price) {
		this.salary = price;
	}

	public String toString(){
		return name + " "+ email + " " +salary;
	}
}
