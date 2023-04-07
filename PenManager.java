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

public class PenManager {
    public List<Pen> allPens = new LinkedList<>();

    public void addListOfPens(List<Pen> allPens) {
        this.allPens.addAll(allPens);
    }

    public void addPen(Pen pen){
        this.allPens.add(pen);
    }

    public List<Pen> findAllWorthMoreThan(int price) {
        return allPens.stream()
                      .filter(pen -> pen.calculatePrice() > price)
                      .collect(Collectors.toList());
    }

    public List<Pen> findAllWithMoreItemsThan(int number) {
        return allPens.stream()
                      .filter(pen -> pen.itemsNum() > number)
                      .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        PenManager myManager = new PenManager();
        List<Pen> backpack = new LinkedList<Pen>();
        MarkerPen superMarker = new MarkerPen("a-11", "Mercedes", "orange", "plastic", 12.1, 4, "compact");
        SchoolPen superSchool = new SchoolPen("b-11", "Lanos", "purple", "leather", 20.1, 3, 2, 4);
        BuilderPen superBuilder = new BuilderPen("c-11", "Jeep", "brown", "wood", 123, 2, 5);
        DoctorPen superDoctor = new DoctorPen("d-11", "Volkswagen", "blue", "leather", 45.3, true, 3);
        backpack.add(new SchoolPen());
        backpack.add(superSchool);
        backpack.add(new MarkerPen());
        backpack.add(superMarker);
        backpack.add(superBuilder);
        backpack.add(superDoctor);
        myManager.addPen(superBuilder);
        myManager.addListOfPens(backpack);

        System.out.println("Prices of pens in the backpack:");
        for (var pen :
                myManager.allPens) {
            int number = myManager.allPens.indexOf(pen)+1;
            System.out.println(number + ". " + pen.calculatePrice());
        };

        var expensivePens = myManager.findAllWorthMoreThan(10);
        System.out.println("List of pens for your price category: " + expensivePens);

        var bigPens = myManager.findAllWithMoreItemsThan(5);
        System.out.println("Big enough pens:  " + bigPens);
    }
}
//codeStyle

