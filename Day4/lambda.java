package day4;

interface Tests{
	void m1();
}

public class lambda {
	public static void main(String[] args) {
		Tests t = () -> {System.out.println("Lambda Expression");
	};
	t.m1();
}
}
