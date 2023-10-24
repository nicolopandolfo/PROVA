package org.example;

public class Cat {

    /**
     * Istanze e variabile static totalNumber
     */
    private String name;
    private int age;
    private static int totalNumber;

    /**
     * Costruttori classe Cat
     */
    public Cat(){
        this.totalNumber++;
    }
    public Cat(String name){
        this.name = name;
        this.totalNumber++;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.totalNumber++;
    }

    /**
     * Metodi per settare name, age, totalNumber
     */
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Metodi per tornare name, age, numero gatti, tutte le proprietà
     */
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getTotalNumber(){
        return totalNumber;
    }

    @Override
    public String toString(){
        return  "Cat name: "
                + getName()
                + ". Cat age: "
                + getAge()
                + ". Now we have a group of "
                + getTotalNumber()
                +" cats.";
    }
}
