package org.example;

public class Dog {

    // Dichiarazione variabili locali
    private String name;
    private int age;

    // Costruttore classe
    public Dog(){
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metodo per restituire name
    public String getName(){
        return name;
    }
    // Metodo per restituire age
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Metodo per restituire proprietà oggetto
    public String showProperties(){
        return "A "
                + getAge()
                + " year old dog loves to be called "
                + getName()
                + ".";
    }
}