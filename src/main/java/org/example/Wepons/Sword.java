package org.example.Wepons;

import org.example.Warrior;
import org.example.Weaponable;

import java.util.Random;

public class Sword extends Weapon {

    public Sword(int damagePoint) {
        super(damagePoint);
    }

    @Override
    public String toString() {
        return String.format(" Sword : damage %d ",damagePoint);
    }

    @Override
    public int damage() {
        return new Random().nextInt(0,damagePoint);
    }
}
