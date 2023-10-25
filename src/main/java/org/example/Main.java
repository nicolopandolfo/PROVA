package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dog patricio = new Dog();
        patricio.setName("Patricio");
        patricio.setAge(15);
        Dog kiwi = new Dog("Kiwi",10);
        System.out.println(patricio.showProperties());
        System.out.println(kiwi.showProperties());

        Cat merrell = new Cat();
        merrell.setName("Merrell");
        merrell.setAge(4);
        System.out.println(merrell);
        Cat ray = new Cat("Ray");
        System.out.println(ray);
        Cat solana = new Cat("Solana",3);
        System.out.println(solana);

        Bird marion = new Bird("Marion");
        System.out.println(marion.stringOfNames());
        Bird max = new Bird("Max");
        System.out.println(max.stringOfNames());

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Palindrome");
        listOfStrings.add("Nolemonnomelon");
        listOfStrings.add("AmanaplanacanalPanama");
        listOfStrings.add("MadaminEdenImAdam");
        listOfStrings.add("AToyotasAToyota");
        for (String string : listOfStrings) {
            System.out.println(Util.isPalindrome(string));
        }
    }
}