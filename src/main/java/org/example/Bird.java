package org.example;

public class Bird {

    /**
     * Variabili locali
     */
    private String name;
    private static StringBuilder stringOfNames = new StringBuilder();

    /**
     * Costruttori
     */
    public Bird(){}

    public Bird(String name){
        this.name = name;
        if (stringOfNames.isEmpty()) {
            stringOfNames.append("Birds actually alive: ");
        }
        else{
            stringOfNames.append(", ");
        }
        stringOfNames.append(name);
    }

    /**
     * Metodo mostra lista
     */
    public StringBuilder stringOfNames(){
        return stringOfNames;
    }
}
