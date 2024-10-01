package exercises.builder.exercise02;

public class ComputerBuilder {

	private String CPU;
	private String RAM;
	private String storage;
	private String OPS;
	private String GPU;
	
	public ComputerBuilder(String CPU, String RAM, String storage, String OPS) {
		this.CPU = CPU;
		this.RAM = RAM;
		this.storage = storage;
		this.OPS = OPS;
	}

	public ComputerBuilder setGPU(String GPU) {
		this.GPU = GPU;
		return this;
	}
	
	public Computer build() {
		return new Computer(this);
	}
	
}
