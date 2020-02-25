package Exception.CalculatorTest;

public class CaculatorTest {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MILTIPLY = "*";
    private static final String DIVIDE = "/";

    static double calculate(double a, double b, String operator) {
        double result = 0;

        switch(operator){
            case PLUS:
                result = a + b;
            break;
            case MINUS:
                result = a - b;
            break;
            case MILTIPLY:
                result = a * b;
            break;
            case DIVIDE:
                if(b == 0)
                    throw new ArithmeticException("Pamiętaj cholero nie dziel nigdy przez ZERO !!!");
                result = a / b;
                break;
            default:
                throw new UnknownOperaporException("Nieznany operator arytmetyczny ");
        }

        return result;
    }
}
