package org.example;

public abstract class Warrior {
    private String name;
    private int healthPoint;
//    private Weaponable weapon;
//    private Shieldable shield;

    public Warrior(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
//        this.weapon = weapon;
//        this.shield = shield;
    }

//    public Shieldable getShield() {
//        return shield;
//    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

//    public Weaponable getWeapon() {
//        return weapon;
//    }

//    public void setHealthPoint(int healthPoint) {
//        this.healthPoint = healthPoint;
//    }

    @Override
    public String toString() {
        return String.format(" name = %s : healthPoint = %d ",name, healthPoint);
    }
}
