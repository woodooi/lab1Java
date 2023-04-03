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
    public final int priceMarker = 4;
    private int numMarkers;
    private String typeMarkers;

    MarkerPen(String id, String brand, String color, String material, double size, int num, String type) {
        super(id, brand, color, material, size);
        numMarkers = num;
        typeMarkers = type;
    }

    @Override
    public int calculatePrice() {
        return numMarkers * priceMarker;
    }

    @Override
    public int itemsNum() {
        return numMarkers;
    }
}
