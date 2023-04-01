package ua.lviv.iot.algo.part1.lab1.lab1Java;


import lombok.NoArgsConstructor;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
@NoArgsConstructor
public class PenManager {

    public static void main(String[] args) {
        List<Pen> backpack = new LinkedList<Pen>();
        backpack.add(new MarkerPen());
        MarkerPen superMarker = MarkerPen.builder()
                .numMarkers(3)
                .id("11-02")
                .brand("Mercedes")
                .color("purple")
                .size(12.2)
                .material("plastic")
                .build();
        backpack.add(superMarker);
        backpack.add(new SchoolPen());
        SchoolPen superSchool = SchoolPen.builder()
                .id("12-02")
                .brand("Toyota")
                .color("brown")
                .material("wood")
                .size(23.8)
                .numPens(2)
                .numPencils(4)
                .numErasers(1)
                .build();
        backpack.add(superSchool);
        for (var pen:
             backpack) {
            System.out.println(pen.calculatePrice());
        };
    }
}
