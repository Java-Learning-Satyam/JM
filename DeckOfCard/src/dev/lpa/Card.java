package dev.lpa;

import javax.xml.stream.FactoryConfigurationError;

public class Card {

    private Suit suit;
    private String faceVale;
    private int rank;

    @Override
    public String toString() {
        return "Face value " + faceVale + " suit " + suit + " rank(" + rank + ")";
    }

    
}
