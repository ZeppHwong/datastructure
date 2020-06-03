package com.demo.sort;

public class SelectionSort {
    public static <T extends Comparable<T>> void selectionSort(T[] a, int n){
        for (int i = 0; i < n-1; i++) {
            int indexOfNextSmallest = getIndexOfSmallest(a, i, n-1);
            swap(a, i, indexOfNextSmallest);
        }
    }

    public static <T extends Comparable<T>> int getIndexOfSmallest(T[] a, int first, int last){
        T min = a[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++) {
            if(a[index].compareTo(min) < 0){
                min = a[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    public static void swap(Object[] a, int i, int j){
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
