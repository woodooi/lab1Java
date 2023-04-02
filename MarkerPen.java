package ua.lviv.iot.algo.part1.lab1.lab1Java;

import lombok.*;
import lombok.experimental.SuperBuilder;

@ToString
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class MarkerPen extends Pen {
    MarkerPen(String id, String brand, String color, String material, double size, int num, String type) {
        super(id, brand, color, material, size);
        this.numMarkers = num;
        this.typeMarkers = type;
    }

    public final int priceMarker = 4;
    private int numMarkers;
    private String typeMarkers;

    @Override
    int calculatePrice() {
        return numMarkers * priceMarker;
    }

    @Override
    int itemsNum() {
        return numMarkers;
    }
}
