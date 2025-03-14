package com.example.kiosk.Lv2;

public class MenuItem {



        // 속성 제품명, 가격, 제품설명
        private String name;
        private int price;
        private String description;

          // 생성자
        public MenuItem (String name, int price, String description) {
            this.name = name;
            this.price = price;
            this.description = description;
        }

        // 기능
        public String getName() {
            return this.name;
        }

        public int getPrice() {
            return this.price;
        }

        public String getDescription() {
            return this.description;
        }




    }


