public class MethodOverloading {
    void m1(int a){
        System.out.println("method "+a);
    }

    void m1(){
        System.out.println("method without parameter");
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.m1(10);
        mo.m1();
    }
}