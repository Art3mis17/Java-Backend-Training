package day4;

@FunctionalInterface

interface funcInterface {

	void m1();

}
 
public class funcinterface {
 
	public static void main(String[] args) {
 
		funcInterface obj = () -> {

			System.out.println("Hello  ia m functional interface");

		};

		obj.m1();

	}
 
}
 
