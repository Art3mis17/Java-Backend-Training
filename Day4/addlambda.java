package day4;

interface Tests{
	void m1(int a , int b);
}
public class addlambda {
	public static void main(String[] args) {
		Tests i = (a,b) -> System.out.println("The values of a and b added : " + (a+b));
		i.m1(2, 3);
	}
}
