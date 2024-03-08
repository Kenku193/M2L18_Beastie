package org.example.example3Anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class App {

    public static void main(String[] args) throws IllegalAccessException {

        Client client = new Client();

        client.id = 222;

        Class<? extends Client> refl = client.getClass();

        Field[] declaredFields = refl.getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.println(field.getModifiers() + " " + field.getType() + " " + field.getName());
        }

        Integer gettedId = (Integer) declaredFields[0].get(client);
        System.out.println(gettedId);

        declaredFields[0].set(client, 555);
        System.out.println((Integer) declaredFields[0].get(client));

        Annotation[] declaredAnnotations = declaredFields[0].getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println(declaredAnnotation);
        }

        for (Field f : client.getClass().getDeclaredFields()) {
            TudaSuda annotation = f.getAnnotation(TudaSuda.class);
            if (annotation != null){

                if (annotation.isOk()) {
                    System.out.println("IS OK - OK");
                }
                else
                {
                    System.out.println("NOT OK");
                }

                System.out.println(annotation.clientType());
                System.out.println(annotation.name());

            }
        }

    }
}
