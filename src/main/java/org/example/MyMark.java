package org.example;

import java.lang.annotation.Retention;

public interface MyMark {
}

class MarkedClass implements MyMark {}

class NonMarkedClass {}

class Main {

    public static void main(String[] args) {

        MarkedClass markedClass = new MarkedClass();
        NonMarkedClass nonMarkedClass = new NonMarkedClass();

        // test(nonMarkedClass);

    }

    static void test(MyMark markedObject){
        System.out.println("Метод Test успешно заврешен!");
    }
}



