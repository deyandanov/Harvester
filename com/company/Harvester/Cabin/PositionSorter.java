package com.company.Harvester.Cabin;

import java.awt.*;
import java.util.Comparator;

public class PositionSorter implements Comparator<Point> {
    public int compare(Point point1, Point point2){
        if (point1.getX() == point2.getX()) {
            if (point1.getY() > point2.getY())
                return 1;
            else
                return -1;
        }else if (point1.getX() > point2.getX())
            return 1;
        else
            return 0; //dummy
    }
}
