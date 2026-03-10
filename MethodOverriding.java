class subDemo {
    void property() {
        System.out.println("property of subDemo");
    }

    void m1() {
        System.out.println("method of subDemo");
    }
}

public class MethodOverriding extends subDemo {
    void m1() {
        System.out.println("method of Demo");
    }

    public static void main(String[] args) {
        MethodOverriding mo = new MethodOverriding();
        mo.m1();
        mo.property();
    }
}