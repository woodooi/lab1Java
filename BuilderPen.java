package ua.lviv.iot.algo.part1.lab1.lab1Java;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BuilderPen extends Pen {
    BuilderPen(String id, String brand, String color, String material, double size, int wrenches, int screws) {
        super(id, brand, color, material, size);
        this.numWrenches = wrenches;
        this.numScrewdrivers = screws;
    }

    private int numWrenches;
    private int numScrewdrivers;

    @Override
    int calculatePrice() {
        return 0;
    }

    @Override
    int itemsNum() {
        return numScrewdrivers + numWrenches;
    }
}
