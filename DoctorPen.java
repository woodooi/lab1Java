package ua.lviv.iot.algo.part1.lab1.lab1Java;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DoctorPen extends Pen {
    DoctorPen(String id, String brand, String color, String material, double size, boolean scope, int syringes) {
        super(id, brand, color, material, size);
        this.isStethoscope = scope;
        this.numSyringes = syringes;
    }

    private boolean isStethoscope;
    private int numSyringes;

    @Override
    int calculatePrice() {
        return 0;
    }

    @Override
    int itemsNum() {
        if (isStethoscope == true)
            return numSyringes + 1;
        else return numSyringes;
    }
}
