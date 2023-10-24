package org.example;


public class Main {
    public static void main(String[] args) {

        Dog patricio = new Dog();
        patricio.setName("Patricio");
        patricio.setAge(15);
        Dog kiwi = new Dog("Kiwi",10);

        System.out.println(patricio.showProperties());
        System.out.println(kiwi.showProperties());

        Cat merrell = new Cat();
        merrell.setCatName("Merrell");
        merrell.setCatAge(4);
        Cat ray = new Cat("Ray");
        Cat solana = new Cat("Solana",3);

        System.out.println(merrell.showProperties());
        System.out.println(ray.showProperties());
        System.out.println(solana.showProperties());
    }
}