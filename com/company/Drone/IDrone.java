package com.company.Drone;


import com.company.Field.Field;
import com.company.Field.Wheat;
import java.util.HashSet;

public interface IDrone {

    public HashSet<Wheat> scanField (Field f);
}
