package day4;

interface Left1 {
	default void m1() {
		System.out.println("Left defualt method");
	}
}
interface Right1 {
	default void m1() {
		System.out.println("Righ defualt method");
	}
}
public class overrideinterface implements Left1, Right1 {
	public void m1() {
//		Right.super.m1();
		System.out.println("ovveride method");
	}
	public static void main(String[] args) {
		overrideinterface t = new overrideinterface();
		t.m1();
	}
}
