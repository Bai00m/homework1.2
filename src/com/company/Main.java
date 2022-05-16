package com.company;

public class Main {
    public static String option = "Можно идти гулять";
    public static String option1 = "Оставайтесь дома";

    public static void main(String[] args) {
        System.out.println(concat(20, 54));
        System.out.println(concat(43, 54));
        System.out.println(concat(54, 23));
        System.out.println(concat(38, 23));
        System.out.println(concat(43, 14));
    }

    public static String concat(int age, int temperature){
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30){
            return option;
        } else if (age < 20 && temperature > 0 && temperature < 28){
            return option;
        } else if (age > 45 && temperature > -10 && temperature < 25){
            return option;
        } else {
            return option1;
        }
    }
}
