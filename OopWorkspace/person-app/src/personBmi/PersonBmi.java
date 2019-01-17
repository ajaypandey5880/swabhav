package personBmi;

public class PersonBmi {
	private float height;
	private float weight;
	private int age;
	private GenderOptions gender;
	private String name;
	private float bmi;

	public PersonBmi(String newName, int newAge, float newHeight, float newWeight, GenderOptions newgender) {
		name = newName;
		age = newAge;
		height = newHeight;
		weight = newWeight;
		gender = newgender;

	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public GenderOptions getGender() {
		return gender;
	}

	public void setGender(GenderOptions newGender) {
		gender = newGender;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void workOut() {
		weight = weight + (300/weight);
	}

	public void eat() {
		weight = weight * 1.02f;
		height = height * 1.02f;
	}

	public float calculateBmi() {
		bmi = (weight) / (height * height);
		return bmi;
	}

	public String bmiCategory() {
		calculateBmi();
		if (bmi > 25.0) {
			return "overweight";
		}
		if (bmi < 24.9 && bmi > 18.5) {
			return "healthy";
		}
		return "underweight";
	}
}
