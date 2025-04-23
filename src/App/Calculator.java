package App;

import java.util.ArrayList; // ArrayList를 사용하기 위한 임포트


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
            System.out.println("다시 입력해주세요");
            return 0;
        }

        results.add(result);


        return result;


    }

    public ArrayList<Double> getResults() {
        return results;
    }

    public void setResults(ArrayList<Double> results) {
        this.results = results;


        }

    public void resultremove(String str1){
        if(str1.equals("yes")){
            results.remove(0);
        }
        else if(str1.equals("no")){
        }
        else{
            System.out.println("다시 입력해주세요");
        }
    }






}
