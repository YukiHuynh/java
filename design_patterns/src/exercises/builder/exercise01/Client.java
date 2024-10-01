package exercises.builder.exercise01;

public class Client {

	public static void main(String[] args) {
		Person person = Person.builder("Nguyen", 29)
				.withAddress("10A Pasteur").withPhoneNumber("1234567890").build();
		System.out.println(person);
	}
	
}
