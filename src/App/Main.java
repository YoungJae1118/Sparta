package App;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cc = new Calculator();

        int ii=0;
        do {
            System.out.println("첫번째 양의 정수를 입력하세요");
            double num1 = sc.nextInt();


            System.out.println("두번째 양의 정수를 입력하세요");
            double num2 = sc.nextInt();

            System.out.println("+ , - , * , /");
            char i = sc.next().charAt(0);

             cc.calculate(num1,num2,i);


            sc.nextLine();

            int a=0;
            while (a==0) {
                System.out.println("계속하시겠습니까? [yes or exit or data]");
                String str = sc.nextLine();
                if (str.equals("yes")) {
                    ii = 1;
                    a=1;
                } else if (str.equals("exit")) {
                    ii = 2;
                    a=1;
                    System.out.println("종료하겠습니다");
                    System.out.println("지금까지의 결과는");

                    Calculator calc;
                    ArrayList<Double> results = cc.getResults();
                    for (double result : results) {
                        System.out.println(result);



                    }
                    System.out.println("이상입니다");
                } else if(str.equals("data")) {
                    ArrayList<Double> results = cc.getResults();
                    for (double result : results) {
                        System.out.println(result);

                        System.out.println("데이터를 삭제하시겠습니까?(맨처음 데이터) yes or no");
                        String str1 = sc.nextLine();
                        cc.resultremove(str1);
                        a=0;
                    }


                } else {
                    System.out.println("다시 입력해주세요");
                    a =0;
                }






            }



        } while (ii==1);







    }
}
