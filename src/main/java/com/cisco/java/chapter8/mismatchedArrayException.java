package com.cisco.java.chapter8;

public class mismatchedArrayException extends Exception {
    int[] array1 , array2;
    public mismatchedArrayException(int[] array1,int[] array2){
        this.array1 = array1;
        this.array2 = array2;
    }
    @Override
    public String toString() {
        return ("Mismatched array length. The length of the array1 is "+array1.length+"and the length of array2 is "+array2.length);
    }
}
