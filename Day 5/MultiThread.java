package day5;

public class MultiThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run method "+i);
		}
	}
	public static void main(String[] args) {
		MultiThread tt = new MultiThread();
		tt.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main method "+i);
		}
	}
}