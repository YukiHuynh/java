package thread;

public class Ex01HelloWorldThread extends Thread{

	@Override
	public void run() {
		System.out.println("Hello, World!");
	}
	
	public static void main(String[] args) {
		Ex01HelloWorldThread thread = new Ex01HelloWorldThread();
		thread.start();
	}
	
}
