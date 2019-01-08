package com.company;

import com.company.Field.Field;
import com.company.Harvester.Cabin.BordComputer;

public class Main {

    public static void main(String[] args) {

        Field field = new Field();
        BordComputer bordcomputer = new BordComputer(field);
        bordcomputer.droneScan();
        //field.PrintField();
    }
}
