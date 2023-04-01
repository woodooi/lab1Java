package ua.lviv.iot.algo.part1.lab1.lab1Java;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.algo.part1.lab1.lab1Java.Pen;

@Getter
@ToString
@Setter
@NoArgsConstructor
@SuperBuilder

public class SchoolPen extends Pen {
    public final int pricePen = 2;
    public final int pricePencil = 1;
    public final int priceEraser = 5;
    private int numPens;
    private int numPencils;
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

    @Override
    int calculatePrice() {
        return numPens*pricePen
                +numPencils*pricePencil
                +numErasers*priceEraser;
    }
}