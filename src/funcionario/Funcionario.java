package funcionario;

public class Funcionario {

	public String name;
	public String gender;
	public int age;
	public String role;
	public int salary; 
	
	public void view() {
		System.out.println("\nThe employee's name is " + getName() + " and their role is " + getRole() + ".");
	}

	public Funcionario(String name, String gender, int age, String role, int salary) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.role = role;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
