package personBmi;

public class TestPersonBmi {

	public static void main(String[] args) {
		PersonBmi person = new PersonBmi("ajay", 18, 1.75f, 100f, GenderOptions.MAlE);

		//printDetails(person);
		person.workOut();
		//printDetails(person);
		//person.eat();
		//person.eat();
		printDetails(person);

	}

	public static void printDetails(PersonBmi person) {
		System.out.println("name is " + person.getName() + "\nage is " + person.getAge() + "\nHeight is "
				+ person.getHeight() + "\nweight is " + person.getWeight() + "\nGender is " + person.getGender()
				+ "\nBMI is " + person.calculateBmi() + "\nBmi Category is " + person.bmiCategory());
	}

}
