public class Operations {
    /*Define methods of add, sub,div,mul, Fibonacci, factorial, area of circle,triangle,rectangle, square, perimeter of circle, triangle, rectangle, square.*/

    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    void div(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }

    void areaOfCircle(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    void areaOfTriangle(double base, double height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

    void areaOfRectangle(double length, double width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    void areaOfSquare(double side) {
        System.out.println("Area of Square: " + (side * side));
    }

    public static void main(String[] args) {
        Operations ops = new Operations();
        ops.add(5, 3);
        ops.sub(5, 3);
        ops.div(5, 3);
        ops.mul(5, 3);
        ops.fibonacci(10);
        ops.factorial(5);
        ops.areaOfCircle(4);
        ops.areaOfTriangle(5, 3);
        ops.areaOfRectangle(4, 6);
        ops.areaOfSquare(4);
    }
}
