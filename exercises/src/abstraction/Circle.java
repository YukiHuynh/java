package abstraction;

public class Circle extends Shape2D{

	@Override
	public void draw() {
		System.out.println("Circle: Drawing a circle.");
	}

	@Override
	public void resize() {
		System.out.println("Circle: Resizing the circle.");
	}

}
