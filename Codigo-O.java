// Interfaz Operation
public interface Operation {
    double execute(double a, double b);
}

// Clase Addition
public class Addition implements Operation {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}

// Clase Subtraction
public class Subtraction implements Operation {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}

// Clase Calculator
public class Calculator {
    public double calculate(Operation operation, double a, double b) {
        return operation.execute(a, b);
    }
}

// Clase Main para usar las clases anteriores
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Operation addition = new Addition();
        Operation subtraction = new Subtraction();

        double result1 = calculator.calculate(addition, 5, 3);
        double result2 = calculator.calculate(subtraction, 5, 3);

        System.out.println("Addition Result: " + result1); // Output: Addition Result: 8.0
        System.out.println("Subtraction Result: " + result2); // Output: Subtraction Result: 2.0
    }
}
