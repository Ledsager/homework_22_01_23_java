package org.example.Wepons;

import java.util.Random;

public class Bow extends Weapon{
    private int range;

    public Bow(int damagePoint, int range) {
        super(damagePoint);
        this.range = range;
    }

    @Override
    public int damage() {
        return new Random().nextInt(0,damagePoint);
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return String.format(" Bow : range %d, damage %d ", range,damagePoint);
    }
}
