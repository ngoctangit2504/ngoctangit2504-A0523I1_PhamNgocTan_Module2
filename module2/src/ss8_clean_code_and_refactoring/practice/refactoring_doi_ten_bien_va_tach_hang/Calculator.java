package ss8_clean_code_and_refactoring.practice.refactoring_doi_ten_bien_va_tach_hang;

public class Calculator {
    public static int calculate(int firstOperand, int secondOperator, char operator) {
        switch (operator) {
            case '+':
                return firstOperand + secondOperator;
            case '-':
                return firstOperand - secondOperator;
            case '*':
                return firstOperand * secondOperator;
            case '/':
                if (secondOperator != 0)
                    return firstOperand / secondOperator;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
