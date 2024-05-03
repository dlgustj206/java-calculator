package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorView {
    Scanner sc = new Scanner(System.in);

    public int getActionInput() {
        System.out.println("========= Calculator =========");
        System.out.println("1. 계산기 사용");
        System.out.println("2. 계산기 종료");

        int action;
        while(true) {
            try {
                System.out.print("옵션을 선택하세요: ");
                action = sc.nextInt();

                if(action < 1 || action > 2) {
                    throw new InputMismatchException();
                }
                break;
            }
            catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("*ERROR: 유효하지 않은 옵션입니다*");
            }
        }
        return action;
    }

    public int getIntInput(String message) {
        while(true) {
            try {
                System.out.print(message);
                return sc.nextInt();
            }
            catch (InputMismatchException e) {
                sc.next(); // 버퍼 비우기
                System.out.println("*ERROR: 정수를 입력하세요*");
            }
        }
    }

    public String getOperatorInput(String message) {
        while(true) {
            System.out.print(message);
            String op = sc.next();
            if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                return op;
            }
            else {
                System.out.println("*ERROR: 연산자를 입력하세요*");
            }
        }
    }

    public void printResult(int num1, int num2, String op, int res) {
        System.out.println("계산 결과: " + num1 + " " + op + " " + num2 + " = " + res);
    }

    public void endCalculator() {
        System.out.println("============ 종료 ============");
    }
}
