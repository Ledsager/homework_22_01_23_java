package org.example.Shields;

import java.util.Random;

public class Hoplon extends Shield{
    public Hoplon(int protectionPoint) {
        super(protectionPoint);
    }

    @Override
    public String toString() {
        return String.format(" Hoplon : protection %d ", protectionPoint);
    }
    @Override
    public int protection() {
        return new Random().nextInt(0,protectionPoint);
    }
}
