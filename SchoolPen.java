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
    SchoolPen(String id, String brand, String color, String material, double size, int pens, int pencils, int erasers) {
        super(id, brand, color, material, size);
        this.numPens = pens;
        this.numPencils = pencils;
        this.numErasers = erasers;
    }
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

    @Override
    public int itemsNum() {
        return numPens + numErasers + numPencils;
    }

    @Override
    public int calculatePrice() {
        return numPens * pricePen
                + numPencils * pricePencil
                + numErasers * priceEraser;
    }
}