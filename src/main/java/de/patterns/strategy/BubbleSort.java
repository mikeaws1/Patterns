package de.patterns.strategy;

public class BubbleSort<E extends Comparable<E>> implements Sort<E> {

    public void sort(E[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i;  j < array.length; j++) {

                if (array[i].compareTo(array[j]) == 1) {

                    E tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    
                }
            }
        }
    }
}