package ua.lviv.iot.algo.part1.lab1.lab1Java;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DoctorPen extends Pen {
    private boolean isStethoscope;
    private int numSyringes;

    DoctorPen(String id, String brand, String color, String material, double size, boolean stethoscope, int syringes) {
        super(id, brand, color, material, size);
        isStethoscope = stethoscope;
        numSyringes = syringes;
    }

    @Override
    public int calculatePrice() {
        return 0;
    }

    @Override
    public int itemsNum() {
        if (isStethoscope == true)
            return numSyringes + 1;
        else
            return numSyringes;
    }
}
