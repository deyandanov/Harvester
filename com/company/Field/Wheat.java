package com.company.Field;

import com.company.Drone.Position;

import java.util.Random;

public class Wheat implements Comparable<Wheat> {
    private int numberOfGrains;
    private Position position;

    public Wheat() {
        Random random = new Random();
        this.numberOfGrains = 100 + random.nextInt(401);
    }

    public int getNumberOfGrains() {
        return numberOfGrains;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public int compareTo(Wheat o) {
        int gDifference = -numberOfGrains + o.getNumberOfGrains();
        if(gDifference != 0){
            return gDifference;
        }
        //compare name
        int xDifference = position.getX() - o.getPosition().getX();
        if(xDifference != 0){
            return xDifference;
        }
        int yDifference = position.getY() - o.getPosition().getY();
        if(yDifference != 0){
            return yDifference;
        }
        return 0;
    }
}


