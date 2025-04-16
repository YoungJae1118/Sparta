package excalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ii=0;
        do {
                System.out.println("첫번째 양의 정수를 입력하세요");
                double num1 = sc.nextInt();


                System.out.println("두번째 양의 정수를 입력하세요");
                double num2 = sc.nextInt();

                System.out.println("1:더하기 , 2:빼기 , 3:곱하기 , 4:나누기");
                int i = sc.nextInt();
                if (i == 1) {
                    double result = num1 + num2;
                    System.out.println("결과는 " + result);

                } else if (i == 2 && num1 >= num2) {            //먼저 입력한 정수가 크거나 같을 때 딱히 문제 없음
                    double result = num1 - num2;
                    System.out.println("결과는 " + result);

                } else if (i == 2) {                          //나중에 입력한 정수가 크면 - 붙여주기
                    double result = num1 - num2;
                    System.out.println("결과는 -" + result);

                } else if (i == 3) {
                    double result = num1 * num2;
                    System.out.println("결과는 " + result);


                } else if (i == 4) {
                    double result = num1 / num2;
                    System.out.println("결과는 " + result);
                }
                else {
                    System.out.println("다시 입력해주세요");
                }

            sc.nextLine();

            int a=0;
            while (a==0) {
                System.out.println("계속하시겠습니까? [Yes or exit]");
                String str = sc.nextLine();
                if (str.equals("Yes")) {
                    ii = 1;
                    a=1;
                } else if (str.equals("exit")) {
                    ii = 2;
                    a=1;
                    System.out.println("종료하겠습니다");

                } else {
                    System.out.println("다시 입력해주세요");
                    a =0;
                }
            }



            } while (ii==1); //푸시가 왜 안될까


   //



    }
}
