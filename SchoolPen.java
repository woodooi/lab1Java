package ua.lviv.iot.algo.part1.lab1.lab1Java.lab1Java;

import lombok.*;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SchoolPen {
    private String id = "isn-101";
    private String brand;
    private String color;
    private String material;
    private double size;
    private int numPencils;
    private int numPens;
    private int numErasers;

    public void addPencil() {
        numPencils++;
    }

    public void addPen() {
        numPens++;
    }

    public void removePencil() {
        if (numPencils > 1)
            numPencils--;
        else return;
    }

    public void removePen() {
        if (numPens > 1)
            numPens--;
        else return;
    }

    public static SchoolPen instance = new SchoolPen();

    static SchoolPen getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SchoolPen backpack[] = {
                new SchoolPen(),
                new SchoolPen("239832-234234", "Toyota"
                        , "red", "leather", 23.1, 2, 3, 28),
                getInstance(), getInstance()
        };
        for (SchoolPen pen : backpack) {
            System.out.println(pen);
        }
    }
}