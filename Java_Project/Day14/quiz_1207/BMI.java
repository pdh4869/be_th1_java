package quiz_1207;

public class BMI {
	double height, weight;
	char gender;

	public BMI() {}
	
	public BMI(double height, double weight, char gender) {
		super();
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void display() {
		System.out.println("키: "+height);
		System.out.println("몸무게: "+weight);
		System.out.println("성별: "+gender);
	}
}
