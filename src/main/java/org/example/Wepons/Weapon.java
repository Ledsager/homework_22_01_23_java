package org.example.Wepons;

import org.example.Warrior;
import org.example.Weaponable;

public abstract class Weapon implements Weaponable {
    public int damagePoint;

    public Weapon(int damagePoint) {
        this.damagePoint = damagePoint;
    }
}
