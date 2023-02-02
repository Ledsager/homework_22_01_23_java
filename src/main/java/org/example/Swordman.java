package org.example;

import org.example.Shields.Shield;
import org.example.Wepons.Bow;
import org.example.Wepons.Sword;

public class Swordman extends Warrior implements Weaponable, Shieldable {
    private Weaponable weapon;
    private Shieldable shield;

    public Swordman(String name, int healthPoint, Weaponable weapon, Shieldable shield) {

        super(name, healthPoint);
        this.weapon = weapon;
        this.shield = shield;
    }

    public int protectHero() {
        return ((Shield)shield).protectionPoint;
    }

    @Override
    public String toString() {
        return " Class Swordman " + super.toString() + weapon + shield;
    }

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public int protection() {
        return 0;
    }

}
