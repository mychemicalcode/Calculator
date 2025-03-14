package com.example.kiosk.Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[ L O T T E R I A ]");
        System.out.println("1. Bulgogi Burger    |W 4.8 | 두툼한 쇠고기패티와 한국적인 맛의 소스가 잘 조화된 롯데리아 대표 버거");
        System.out.println("2. Chicken Burger    |W 4.1 | 닭고기패티와 데리야끼 소스로 만든 담백하고 달콤한 맛의 치킨버거");
        System.out.println("3. Shrimp Burger     |W 4.8 | 새우살을 가득넣어 더 맛있어진 오리지널 새우버거");
        System.out.println("4. Teri Burger       |W 3.5 | 쇠고기패티에 달콤 짭짤한 데리소스를 더한 가성비 버거");
        System.out.println("0. 종료          | 종료  ");

        System.out.println("어서 오세요 롯데리아 입니다.");
        System.out.println("원화는 메뉴의 숫자를 입력해주세요.");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("입력이 잘못되었습니다. 다시 확인하여 원하는 메뉴의 숫자를 눌러주세요");
        }
        int num1 = scanner.nextInt();

        switch (num1) {
            case 1 -> System.out.println("선택하신 메뉴는 1번 Bulgogi Burger입니다.");
            case 2 -> System.out.println("선택하신 메뉴는 2번 Chicken Burger입니다.");
            case 3 -> System.out.println("선택하신 메뉴는 3번 Shrimp Burger입니다.");
            case 4 -> System.out.println("선택하신 메뉴는 4번 Teri Burger입니다.");
            case 0 -> System.out.println("주문을 종료합니다. 감사합니다.");
            default -> System.out.println("올바른 숫자를 입력해 주세요.");
        }

        }
    }
//
//        if (num1 == 1) {
//            System.out.println("선택하신 메뉴는 1번 Bulgogi Burger입니다.");
//
//        } else if (num1 == 2) {
//            System.out.println("선택하신 메뉴는 2번 Chicken Burger입니다.");
//
//        } else if (num1 == 3) {
//            System.out.println("선택하신 메뉴는 3번 Shrimp Burger입니다.");
//
//        } else if (num1 == 4) {
//            System.out.println("선택하신 메뉴는 4번 Teri Burger입니다.");
//
//        } else if (num1 == 0) {
//            System.out.println("주문을 종료합니다. 감사합니다.");
//        }





