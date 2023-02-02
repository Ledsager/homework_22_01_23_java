package org.example;

import org.example.Wepons.Bow;
import org.example.Wepons.Weapon;

public class Archer extends Warrior implements Weaponable{
    private Weaponable weapon;

    public Archer(String name, int healthPoint, Weaponable weapon) {

        super(name, healthPoint);
        this.weapon=weapon;
    }

    @Override
    public String toString() {
        return " Class Archer "+ super.toString() + weapon;
    }

    public int shotRange() {
        return ((Bow)weapon).getRange();

    }

    @Override
    public int damage() {
        return 0;
    }
}
