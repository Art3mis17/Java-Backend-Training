package day4;

interface Tests {
	int m1(int x);
}

public class sqrlambda {
	public static void main(String[] args) {
		Tests i = x -> x * x;
		System.out.println("the square " + i.m1(5));
	}

}
