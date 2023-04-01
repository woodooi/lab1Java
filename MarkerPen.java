package ua.lviv.iot.algo.part1.lab1.lab1Java;
import lombok.*;
import lombok.experimental.SuperBuilder;

@ToString
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor

public class MarkerPen extends Pen {
    public final int priceMarker = 4;
    private int numMarkers;
    private String typeMarkers;

    @Override
    int calculatePrice() {
        return numMarkers*priceMarker;
    }
}
