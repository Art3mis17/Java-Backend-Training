public class Demo {
    int a=19;
    static	int b =20;

    void m1() {
        int a =29;
        System.out.println("this is the method "+a);
    }

    public Demo() {
        int a = 10;
        System.out.println("constructor "+a);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.m1();
        System.out.println(demo.a);
        System.out.println(Demo.b);

    }
}









