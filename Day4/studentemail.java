package day4;

class Student {
	String email;
	public Student(String email) {
		this.email = email;
	}
	String getEmail() {
		return email;
	}
}
public class studentemail {
	public static void main(String[] args) {
		Student s = new Student(null);
		String email = s.getEmail();
		System.out.println(email.length());
	}
}
