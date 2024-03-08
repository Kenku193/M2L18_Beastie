package org.example.example4Lombok;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(of = "name")
@Builder
public class Human {

    public String name;
    int age;

}
