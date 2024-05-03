package model;

public class CalculatorModel {

    public int calculate(int num1, int num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if(num2 != 0) {
                    return num1 / num2;
                }
                else {
                    throw new ArithmeticException("*ERROR: 0으로 나눌 수 없습니다*");
                }
            default:
                throw new IllegalArgumentException("*ERROR: 지원하지 않는 연산자입니다*");
        }
    }
}
