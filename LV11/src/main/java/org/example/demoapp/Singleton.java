package org.example.demoapp;

public class Singleton {

    private static Singleton instance;
    private String name;
    private Singleton() {

    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void showMessage() {
        System.out.println("Hello World");
    }
}
