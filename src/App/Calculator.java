package App;

import java.util.ArrayList; // ArrayList를 사용하기 위한 임포트
import java.util.Scanner;

public class Calculator {

    private ArrayList<Double> results = new ArrayList<>(); // 연산 결과를 저장할 ArrayList 선언

    // 계산을 수행하고, 결과를 리스트에 저장하는 메서드
    public double calculate(double num1, double num2, char operator) {
        double result = 0;

        // 연산 기호에 따라 계산을 수행
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("결과는 " + result);

        } else if (operator == '-' && num1 >= num2) {
            result = num1 - num2;
            System.out.println("결과는 " + result);

        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("결과는 -" + result);

        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("결과는 " + result);

        } else if (operator == '/') {
            if (num2 == 0) { // 0으로 나누는 예외 처리
                System.out.println("0으로 나눌 수 없습니다.");
                return 0; // 나누기 0 처리 시 0 반환
            }
            result = num1 / num2;
            System.out.println("결과는 " + result);

        } else {
            System.out.println("지원하지 않는 연산자입니다.");
            return 0; // 유효하지 않은 연산자 처리 시 0 반환
        }

        // 연산 결과를 results 리스트에 추가
        results.add(result);

        // 계산 결과 반환
        return result;
    }

    // 결과 리스트를 반환하는 메서드 (optional, 결과를 조회하고 싶을 경우
    public ArrayList<Double> getResults() {
        return results;
    } //
}
