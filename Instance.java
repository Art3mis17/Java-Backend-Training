public class Instance {

    {
        System.out.println("Heello block");
    }

    static {
        System.out.println("static Heello block");
    }

    public static void main(String[] args) {
        Instance demo = new Instance();

    }
}