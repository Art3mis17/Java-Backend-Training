abstract class Animal
{
  abstract	void eat();
}
public class anonymous {
	  Animal cc = new Animal() {
		void eat() {
	     System.out.println("Animal ear grass");		
		}
	};
	public static void main(String[] args) {
		anonymous  t = new anonymous();
		t.cc.eat();
	}
	
}