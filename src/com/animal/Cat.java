package com.animal;

public class Cat extends Animal {
    String sayName = "Я кот. Зовут меня - ";



    public Cat(String name) {
        super(name);
    }

    public String getName () {
        super.getName();
        return sayName + name;
    }
}
