package ua.lviv.iot.algo.part1.lab1.lab1Java;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder

public abstract class Pen {
    private String id = "isn-101";
    private String brand;
    private String color;
    private String material;
    private double size;
    abstract int calculatePrice();
}
