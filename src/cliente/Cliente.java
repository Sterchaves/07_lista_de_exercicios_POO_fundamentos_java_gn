package cliente;

public class Cliente {
	public String name;
	public int age;
	public String gender;
	public String nationality;
	public float high;
	
	public void visualiza() {
		System.out.println("\nThe costumer name is: " + getName() + ", their age is " + getAge());
	}
	

	public Cliente(String name, int age, String gender, String nationality, float high) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.nationality = nationality;
		this.high = high;
	}



	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public float getHigh() {
		return high;
	}
	
	public void setHigh(float high) {
		this.high = high;
	}
}
