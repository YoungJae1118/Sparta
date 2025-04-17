package App;

import java.util.Scanner;
public class Calculator {

    void sum(double num1, double num2, char i) {

        if (i == '+') {
            double result = num1 + num2;
            System.out.println("결과는 " + result);

        } else if (i == '-' && num1 >= num2) {            //먼저 입력한 정수가 크거나 같을 때 딱히 문제 없음
            double result = num1 - num2;
            System.out.println("결과는 " + result);

        } else if (i == '-') {                          //나중에 입력한 정수가 크면 - 붙여주기
            double result = num1 - num2;
            System.out.println("결과는 -" + result);

        } else if (i == '*') {
            double result = num1 * num2;
            System.out.println("결과는 " + result);


        } else if (i == '/') {
            double result = num1 / num2;
            System.out.println("결과는 " + result);
        } else {
            System.out.println("다시 입력해주세요");
        }
    }
}
