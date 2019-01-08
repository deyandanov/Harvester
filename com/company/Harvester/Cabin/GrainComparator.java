package com.company.Harvester.Cabin;

import java.util.Comparator;

public class GrainComparator implements Comparator<Integer> {
    public int compare(Integer grain1, Integer grain2){
        return (grain2.compareTo(grain1));
    }
}
