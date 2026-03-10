class HA {
    void m1() {
        System.out.println("method of A");
    }
}

class HB extends A {
    void m2() {
        System.out.println("method of B");
    }
}

public class HierarchialInheritance extends A {
    void m3() {
        System.out.println("method of Demo");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.m1();
        demo.m3();
    }
}