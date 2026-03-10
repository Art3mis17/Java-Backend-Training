public class DemoConstructor {

    public DemoConstructor(int a) {
        int a = 10;
        System.out.println("constrctor");
    }

    void m1(int x) {
        System.out.println("sdfsdf");
    }

    public static void main(String[] args) {
        DemoConstructor demoC = new DemoConstructor(3);
        demoC.m1(3);

    }
}
