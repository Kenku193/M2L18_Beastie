package org.example.example2Anno;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // РАБОТАЕТ В Runtim'Е
@Target(ElementType.TYPE)  // МОЖЕТ СТОЯТЬ ТОЛЬКО НАД КЛАССОМ
@Inherited
@Documented
public @interface MyAnnotation {
    String name() default "Yura";
    int value();
}
