package com.animal;

import java.util.Scanner;

public class AnimalFactory {
    public static void main(String[] args) {
        getAnimalByKey("da");
    }

    public static Animal getAnimalByKey(String key) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код");

        key = scanner.nextLine();

        Dog da = new Dog("Aramis");
        Dog db = new Dog("Black");
        Dog dc = new Dog("Spaiki");

        Cat ca = new Cat("Amadei");
        Cat cb = new Cat("Baksik");
        Cat cc = new Cat("Snezhiok");

        if (key.equals("da")) {
            System.out.println(da.getName());
        }
        if (key.equals("db")) {
            System.out.println(db.getName());
        }
        if (key.equals("dc")) {
            System.out.println(dc.getName());
        }
        if (key.equals("ca")) {
            System.out.println(ca.getName());
        }
        if (key.equals("cb")) {
            System.out.println(cb.getName());
        }
        if (key.equals("cc")) {
            System.out.println(cc.getName());
        } else {
            System.out.println("Не могу создать Animal");
            return null;

        }
        System.out.println("Введите код");
        return da;
    }


}


