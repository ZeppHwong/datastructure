package com.demo.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static <T extends Comparable<? super T>> void insertionSort(T[] a, int first,int last){
        if(first < last){
            insertionSort(a, first, last -1);
            insertInOrder(a[last], a, first, last -1);
        }
    }


    public static <T extends Comparable<? super T>> void  insertInOrder(T anEntry, T[] a, int begin,int end){
        if(0 <= anEntry.compareTo(a[end])){
            a[end + 1] = anEntry;
        }else if(begin < end){
            a[end + 1] = a[end];
            insertInOrder(anEntry, a, begin, end-1);
        }else{
            a[end + 1] = a[end];
            a[end] = anEntry;
        }
    }

    public static void main(String[] args){
        Integer[] array = {1,2,3,4,8,5,6,34,3881,123};
        insertionSort(array, 0, array.length -1 );
        for (int i = 0; i < array.length; i++) {
            System.out.println("InsertionSort.main::" + array[i]);
        }
    }
}
