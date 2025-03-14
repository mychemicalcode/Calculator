package com.example.kiosk.Lv2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 속성
        List<MenuItem> menuItems = new ArrayList<>();


        // MenuItem class에 객체
        menuItems.add(new MenuItem("Bulgogi Burger", 4800, "두툼한 쇠고기패티와 한국적인 맛의 소스가 잘 조화된 롯데리아 대표 버거"));
        menuItems.add(new MenuItem("Chicken Burger", 4100, "닭고기패티와 데리야끼 소스로 만든 담백하고 달콤한 맛의 치킨버거"));
        menuItems.add(new MenuItem("Shrimp Burger", 4800, "새우살을 가득넣어 더 맛있어진 오리지널 새우버거"));
        menuItems.add(new MenuItem("Teri Burger", 3500, "쇠고기패티에 달콤 짭짤한 데리소스를 더한 가성비 버거"));


        // 메뉴화명 출력
        System.out.println();
        System.out.println("[ L O T T E R I A ]");
        System.out.println();
        System.out.println("메뉴");
        System.out.println();

        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " " + item.getPrice() + "원");
            System.out.println(item.getDescription());
            System.out.println();
        }
        System.out.println("0. 종료          | 종료  ");
        System.out.println();
        System.out.println("어서 오세요 롯데리아 입니다.");
        System.out.println();
        System.out.println("원하는 메뉴의 숫자를 입력해주세요.");

        //

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("입력이 잘못되었습니다. 원하는 메뉴의 숫자를 눌러주세요");
        }
        int num1 = scanner.nextInt();
        if (num1 >= 1 && num1 <= 4) {
            int index = num1 - 1;
            MenuItem selectedItem = menuItems.get(index);
            System.out.println(selectedItem.getName() + " " + selectedItem.getPrice() + " " + selectedItem.getDescription());
        } else if (num1 == 0) {
            System.out.println("주문을 종료합니다. 감사합니다.");
        } else {
            System.out.println("숫자를 확인 후 다시 입력해주시기 바랍니다.");
        }

    }
}

