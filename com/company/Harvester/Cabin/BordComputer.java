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

    /*public TreeMap<Point, Integer> processDroneScan(HashMap<Point, Integer> droneScan){
        TreeMap<Point, Integer> processedMap = new TreeMap<Point, Integer>();
        processedMap.putAll(droneScan);
        //TODO sollen wir wirklich eine TreeMap sortieren?
        return null;
    }*/

    @Override
    public void droneScan() {

        Drone drone = new Drone();
        Set<Wheat> treeSet = new TreeSet<Wheat>();
        treeSet.addAll(drone.scanField(field));

        for (Wheat wheat: treeSet) {
            System.out.println("grains: "+wheat.getNumberOfGrains() + ", position[ x:" + wheat.getPosition().getX() + " y: "+ wheat.getPosition().getY()+" ]");
        }
        System.out.println("count: "+ treeSet.size());


    }


    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

}
