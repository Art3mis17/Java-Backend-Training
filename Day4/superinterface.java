package day4;

interface Left {
	default void m1() {
		System.out.println("Left defualt method");
	}
}
interface Right {
	default void m1() {
		System.out.println("Righ defualt method");
	}
}
public class superinterface implements Left, Right {
	public void m1() {
		Left.super.m1();
	}
	public static void main(String[] args) {
		superinterface t = new superinterface();
		t.m1();
	}
}
