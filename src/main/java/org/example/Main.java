package org.example;


public class Main {
    public static void main(String[] args) {

        Dog patricio = new Dog();
        patricio.setName("Patricio");
        patricio.setAge(15);
        Dog kiwi = new Dog("Kiwi",10);

        System.out.println(patricio.showProperties());
        System.out.println(kiwi.showProperties());

    }
}