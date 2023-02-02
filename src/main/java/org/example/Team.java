package org.example;

import org.example.Shields.Shield;
import org.example.Wepons.Weapon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<E extends Warrior> implements Iterable<E> {
    private List<E> team = new ArrayList<>();


    public Team<E> addWariorTeam(E person) {
        team.add(person);
        return this;
    }

    public int maxRange() {
        int maxRange = 0;
        for (E item : team) {
            if (item instanceof Archer) {
                if (((Archer) item).shotRange() > maxRange) {
                    maxRange = ((Archer) item).shotRange();
                }
            }
        }
        return maxRange;
    }

    public int minProtection() {
        int minProtection = Integer.MAX_VALUE;
        for (E item : team) {
            if (item instanceof Swordman) {
                if (((Swordman) item).protectHero() < minProtection) {
                    minProtection = ((Swordman) item).protectHero();
                }
            }
        }
        if (minProtection==Integer.MAX_VALUE) {
            minProtection=0;
        }
        return minProtection;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }


}
