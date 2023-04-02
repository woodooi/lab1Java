package ua.lviv.iot.algo.part1.lab1.lab1Java;


import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@ToString
@SuperBuilder
public class PenManager {

    public List<Pen> allPens = new LinkedList<>();

    public void addPen(List<Pen> allPens) {
        this.allPens.addAll(allPens);
    }

    public List<Pen> findAllWorthMoreThan(int price) {
        return
                allPens.stream().filter(pen ->
                        pen.calculatePrice() > price).collect(Collectors.toList());
    }

    public List<Pen> findAllWithMoreItemsThan(int number) {
        return
                allPens.stream().filter(pen ->
                        pen.itemsNum() > number).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        PenManager myManager = new PenManager();
        List<Pen> backpack = new LinkedList<Pen>();
        backpack.add(new MarkerPen());
        MarkerPen superMarker = new MarkerPen("a-11", "Mercedes", "orange", "plastic", 12.1, 4, "compact");
        System.out.println(superMarker);
        backpack.add(superMarker);
        backpack.add(new SchoolPen());
        SchoolPen superSchool = new SchoolPen("b-11", "Lanos", "purple", "leather", 20.1, 3, 2, 4);
        backpack.add(superSchool);
        BuilderPen superBuilder = new BuilderPen("c-11", "Jeep", "brown", "wood", 123, 2, 5);
        backpack.add(superBuilder);
        DoctorPen superDoctor = new DoctorPen("d-11", "Volkswagen", "blue", "leather", 45.3, true, 3);
        backpack.add(superDoctor);
        myManager.addPen(backpack);
        for (var pen :
                myManager.allPens) {
            System.out.println(pen.calculatePrice());
        }
        ;
        var expensivePens = myManager.findAllWorthMoreThan(10);
        System.out.println(expensivePens);
        var bigPens = myManager.findAllWithMoreItemsThan(5);
        System.out.println(bigPens);
    }
}
