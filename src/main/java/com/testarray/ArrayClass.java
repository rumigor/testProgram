package com.testarray;

public class ArrayClass {
    public int[] returnArrayAfter4 (int [] array){
        int index = 0;
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i] == 4) {
                index = i+1;
                break;
            }
        }
        if (array[0] != 4 && index == 0){
            throw new RuntimeException();
        }
        int [] newArray = new int[array.length - index];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[index+i];
        }
        return newArray;
    }

    public boolean isArrayRight(int [] array) {
        int one = 0;
        int four = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] !=4) {
                return false;
            }
            else if (array[i] == 1) {one++;}
            else {four++;}
        }
        if (one == 0 || four == 0) {return false;}
        return true;
    }
}
