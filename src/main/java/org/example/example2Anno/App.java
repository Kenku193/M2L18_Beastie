package org.example.example2Anno;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Annotation[] declaredAnnotations = Human.class.getDeclaredAnnotations();
        Arrays.stream(declaredAnnotations).forEach(System.out::println);

    }
}
