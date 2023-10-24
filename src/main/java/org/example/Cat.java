package org.example;

public class Cat {

    /**
     * Istanze e variabile static numCats
     */
    private String catName;
    private int catAge;
    private static int numCats;

    /**
     * Costruttori classe Cat
     */
    public Cat(){
        this.numCats++;
    }
    public Cat(String name){
        this.catName = name;
        this.numCats++;
    }
    public Cat(String name, int age){
        this.catName = name;
        this.catAge = age;
        this.numCats++;
    }

    /**
     * Metodi per settare catName, catAge, numCats
     */
    public void setCatName(String catName) {
        this.catName = catName;
    }
    public void setCatAge(int catAge){
        this.catAge = catAge;
    }

    /**
     * Metodi per tornare catName, catAge, nCats, tutte le proprietà
     */
    public String getCatName(){
        return catName;
    }
    public int getCatAge(){
        return catAge;
    }
    public int getNumCats(){
        return numCats;
    }

    public String showProperties(){
        return  "Cat name: "
                + getCatName()
                + ". Cat age: "
                + getCatAge()
                + ". Now we have a group of "
                + getNumCats()
                +" cats.";
    }
}
