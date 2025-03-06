package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        String codeExit = "exit";
        String keep = "";
        Scanner sc = new Scanner(System.in);

        do {


            System.out.println("첫번째 숫자를 입력해주세요.");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("입력이 잘못되었습니다. 처음 연산을 진행할 숫자를 입력해주십시오.");
            }
            int num1 = sc.nextInt();

            System.out.println("두번재 숫자를 입력해주세요.");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("입력이 잘못되었습니다. 연산을 진행할 두번째 숫자를 입력해주십시오.");
            }
            int num2 = sc.nextInt();

            System.out.println("필요한 연산을 입력해주세요. (+, -, *, /)");
            while (sc.hasNextInt()) {
                sc.next();
                System.out.print("숫자를 입력하셨습니다. 계산을 진행할 연산기호를 하나만 입력하여 주십시오.");
            }
            char ch = sc.next().charAt(0);

            int result = 0;

            if (ch == '+') {
                result = num1 + num2;

            } else if (ch == '-') {
                result = num1 - num2;

            } else if (ch == '*') {
                result = num1 * num2;

            } else if (ch == '/') {

                if (num2 == 0) {
                    System.out.println("분모에는 0이 올 수 없습니다. 처음부터 다시 계산해주세요");
                    break;

                } else {
                    result = num1 / num2;
                }
            } else {
                System.out.println("시스템에 오류가 있습니다 다시 실행해주십시오.");
                break;
            }

            System.out.println(num1 + "" + ch + "" + num2 + "" + "=" + result + " 입니다.");

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");

            // 기존
            sc.nextLine();
            keep = sc.nextLine();
            System.out.println(keep);
        } while (!codeExit.equals(keep));







    }
}