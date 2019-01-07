package com.company;

import java.util.Random;

public class Wheat {
    private int numberOfGrains;
    private Position position;

    public Wheat() {
        Random random = new Random(400);
        this.numberOfGrains = 100 + random.nextInt();
    }
}


