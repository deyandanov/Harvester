package com.company.Field;

import com.company.Drone.Position;

import java.util.Random;

public class Wheat {
    private int numberOfGrains;

    public Wheat() {
        Random random = new Random(400);
        this.numberOfGrains = 100 + random.nextInt();
    }

    public int getNumberOfGrains() {
        return numberOfGrains;
    }
}


