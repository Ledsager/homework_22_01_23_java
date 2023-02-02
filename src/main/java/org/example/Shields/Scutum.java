package org.example.Shields;

import java.util.Random;

public class Scutum extends Shield{

    public Scutum(int protectionPoint) {
        super(protectionPoint);
    }

    @Override
    public String toString() {
        return String.format(" Scutum : protection %d ", protectionPoint);
    }

    @Override
    public int protection() {
        return new Random().nextInt(0,protectionPoint);
    }
}
