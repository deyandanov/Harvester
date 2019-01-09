package com.company.Harvester.Cabin;

import com.company.Drone.Drone;
import com.company.Drone.Position;
import com.company.Field.Field;
import com.company.Field.Wheat;

import java.awt.*;
import java.util.*;

public class BordComputer implements IBoardComputer {

    private TreeSet<Wheat> sortedField = new TreeSet<Wheat>();
    private Field field;

    public BordComputer(Field field) {
        this.field = field;
    }


    @Override
    public void droneScan() {//  sorting the wheat plant list

        Drone drone = new Drone();

        sortedField.addAll(drone.scanField(field));





    }
    public void sortedPrint(){ // printing the sorted list of wheats
        int counter = 0;


        for (Wheat wheat: sortedField) {

            System.out.print("  { grains: "+wheat.getNumberOfGrains() + ", position[ x:" + wheat.getPosition().getX() + " y: "+ wheat.getPosition().getY()+" ]}  ");
            counter ++;

            if (counter%100==0){
                System.out.print("\n");
            }
        }
        System.out.println("\n count: "+ sortedField.size());
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

}
