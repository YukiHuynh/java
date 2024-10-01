package exercises.builder.exercise01;

public class Person {

	private String name; // required
	private int age; // required
	private String address;
	private String phoneNumber;
		
	public Person() {
	}
	
	private Person(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.address = builder.address;
		this.phoneNumber = builder.phoneNumber;
	}
	
	public static Builder builder(String name, int age) {
		return new Builder(name, age);
	}
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}


	public static class Builder {
		private String name; // required
		private int age; // required
		private String address;
		private String phoneNumber;
		
		private Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withAge(int age) {
			this.age = age;
			return this;
		}

		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder withPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public Person build() {
			return new Person();
		}
		
	}
	
}
	

