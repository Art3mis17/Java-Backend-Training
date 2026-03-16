package day5;

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			Thread.yield();
		}
	}
}
public class YieldMultiThread {
	public static void main(String[] args) {
MyThread1  t1 = new MyThread1();
MyThread1  t2 = new MyThread1();

t1.setName("Thread -1");
t1.setName("Thread -2");
		
t1.start();
t2.start();
	}
}
