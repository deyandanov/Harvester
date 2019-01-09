package com.company;

import com.company.Field.Field;
import com.company.Harvester.Cabin.BordComputer;

public class Main {

    public static void main(String[] args) {

        Field field = new Field();
        BordComputer bordcomputer = new BordComputer(field);

        System.out.println("Scannen ...");
        field.PrintField(); // Unsortieretes HashSet darstellen

        System.out.println("Sortierte Liste im Bordcomputer:");
        bordcomputer.droneScan();
        bordcomputer.sortedPrint();// Sortierte TreeSet darstellen

    }
}
