/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson15;

public class  Test1 {
    public static void main(String[] args) {
        Parent parent = new Child("Ivan");
        parent.showInfo();
    }
}

class Parent implements Test2 {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated
    void showInfo() {
        System.out.println("Parent class. name = " + name);
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("Child class. name = " + name);
    }
}