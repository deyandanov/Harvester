package com.company.Drone;


import com.company.Field.Field;
import com.company.Field.Wheat;
import java.util.HashSet;


public class Drone {

    public HashSet<Wheat> scanField (Field f){              //Scans the whole field and provides position to the all wheat plants
        HashSet<Wheat> hashSet = new HashSet<>();
        for (int i = 0; i < f.getX(); i++) {
            for (int j = 0; j < f.getY(); j++) {
                Position position = new Position(i, j);
                Wheat[][] fieldArray = f.getFieldArray();
                fieldArray[i][j].setPosition(new Position(i,j));
                hashSet.add(fieldArray[i][j]);
        }

        }return hashSet;
    }
}
