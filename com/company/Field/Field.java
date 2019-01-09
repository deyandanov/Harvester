package com.company.Field;

public class Field {

    private Wheat fieldArray[][];
    private int x = 1000;
    private int y = 1000;

    public Field(){

        fieldArray = new Wheat[x][y];   // creates wheat plants without seeds

        for(int i = 0; i < x; i++){

            for(int j = 0; j < y; j++){

                fieldArray[j][i] = new Wheat();
            }
        }
    }

    public void PrintField(){



        for(int i = 0; i < x; i++){

            for(int j = 0; j < y; j++){

                Wheat currentWheat = fieldArray[j][i];
                System.out.print(" [pos: (" + i +"|" + j + ") : ");
                System.out.print(currentWheat.getNumberOfGrains()+"] ");

            }
            System.out.print("\n");
        }


    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }


    public Wheat[][] getFieldArray() {
        return fieldArray;
    }

}