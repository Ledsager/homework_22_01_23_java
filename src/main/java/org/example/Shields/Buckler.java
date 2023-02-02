package org.example.Shields;

import java.util.Random;

public class Buckler extends Shield{
    public Buckler(int protectionPoint) {
        super(protectionPoint);
    }

    @Override
    public String toString() {
        return String.format(" Buckler : protection %d ", protectionPoint);

    }

    @Override
    public int protection() {
        return new Random().nextInt(0,protectionPoint);
    }
}
