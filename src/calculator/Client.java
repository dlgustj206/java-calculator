package calculator;

import controller.CalculatorController;

public class Client {

    public static void main(String[] args) {

        CalculatorController ctrl = new CalculatorController();
        ctrl.startCalculator();
    }
}
