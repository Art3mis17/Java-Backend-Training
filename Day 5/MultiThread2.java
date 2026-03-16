package day5;

public class MultiThread2 implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run method " + i);
		}
	}

	public static void main(String[] args) {
		MultiThread2 xx = new MultiThread2();
		Thread tt = new Thread(xx);
		tt.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main method " + i);
		}
	}
}