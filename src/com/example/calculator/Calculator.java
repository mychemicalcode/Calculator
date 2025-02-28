package com.example.calculator;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요.");
        int num1 = sc.nextInt();

        System.out.println("두번재 숫자를 입력해주세요.");
        int num2 = sc.nextInt();

        System.out.println("필요한 연산을 입력해주세요. (+, -, *, /");
        char charAt = sc.next().charAt(0);

        System.out.println("입력 값은 " + num1 + charAt + num2 + " 입니다. 맞습니까?!");

        // pussy test

    }
}
// $ git add.
// $ git remote set-url origin main 하면 여기에 url 뜸
// $ git
//
//
// ㅜㅜ_ㅜㅜ
//
//git branch -M main
//git push -u origin main