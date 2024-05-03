package controller;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController {
    private final CalculatorModel model = new CalculatorModel();
    private final CalculatorView view = new CalculatorView();

    public void startCalculator() {
        while(true) {
            int action = view.getActionInput();
            if(action == 1) {
                performCalculation();
            }
            else if(action == 2) {
                view.endCalculator();
                break;
            }
        }
    }

    private void performCalculation() {
        int num1 = view.getIntInput("첫 번째 정수 입력: ");
        String op = view.getOperatorInput("연산자 입력: ");
        int num2 = view.getIntInput("두 번째 정수 입력: ");

        try {
            int res = model.calculate(num1, num2, op);
            view.printResult(num1, num2, op, res);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
