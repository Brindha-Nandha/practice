package Wrapper;

public class TestClass {
	
	public static void stop() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public static void main(String[] args) throws Exception {
		try {
			TestClass.stop();
		} catch (InterruptedException e) {
			throw new Exception();
		}
	}
}
