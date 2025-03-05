package com.example.calculator;

import java.util.Scanner;

public class Calculator {
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
            // 연산 다 때려박기, 공백 연산 때려박기

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
                    continue;
                    // 예외처리 명시된 내용에 맞게 수정
                } else {
                    result = num1 / num2;
                }
            } else {
                System.out.println("시스템에 오류가 있습니다 다시 실행해주십시오.");
                break;
            }

            System.out.println(num1 + "" + ch + "" + num2 + "" + "=" + result + " 입니다.");

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");

        } while (!codeExit.equals(keep));
        {
            sc.nextLine();
            keep = sc.nextLine();
            System.out.println(keep);
        }
        ;
    }
}



//next int or next double
// 엔터 인식해버리므로 nextLine을 한 번 더 넣어줘야함

// System.out.println("더 계산하시겠습니까? ( Y / N ) ");
// keep = sc.next().charAt(0);
// System.out.println(keep);
// } while (keep == 'Y' || keep == 'y');



// 변수 : num1, num2, result, charAt,


//        System.out.println("입력 값은 " + num1 + " 입니다. 맞습니까?! 맞으면 1 틀리면 2, 처음으로 돌아가려면 #를 눌러주십시오.");
//        Scanner sc = new Scanner(System.in);
//        if (sc.next().charAt(0) == '#') {
//            continue;
//        }
//
//
//        System.out.println("두번재 숫자를 입력해주세요.");
//        int num2 = sc.nextInt();
//
//        System.out.println("필요한 연산을 입력해주세요. (+, -, *, /");
//        char charAt = sc.next().charAt(0);
//
//        System.out.println("입력 값은 " + num1 + charAt + num2 + " 입니다. 맞습니까?!");

// $ git add.
// $ git remote set-url origin main 하면 여기에 url 뜸
// $ git
//
//
// ㅜㅜ_ㅜㅜ
//
//git branch -M main
//git push -u origin main