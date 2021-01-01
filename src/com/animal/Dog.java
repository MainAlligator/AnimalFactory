package com.animal;

public class Dog extends Animal {
   private String sayName = "Я собака. Зовут меня - ";

    public Dog(String name) {
        super(name);
    }
        public String getName () {
           super.getName();
           return sayName + name;

        }

}
