public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Add space between the string and result
        System.out.println("Sum of two integers: " + calc.add(2, 3));
        System.out.println("Sum of three integers: " + calc.add(2, 3, 4));
        System.out.println("Sum of floats: " + calc.add(2.5, 3.5));
    }
}
