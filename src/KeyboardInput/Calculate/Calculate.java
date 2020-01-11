package KeyboardInput.Calculate;

public class Calculate {
    public double calculate(double a, double b, String z) {

        double score = 0;

        switch (z) {
            case "+":
                score = a + b;
                break;
            case "-":
                score = a - b;
                break;
            case "*":
                score = a * b;
                break;
            case "/":
                score = a / b;
                break;
            default:
                System.out.println("Błędny operator !!!");

        }
        return score;

    }
}
