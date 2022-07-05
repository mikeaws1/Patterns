package de.patterns.strategy;

public interface Sort<T extends Comparable<T>> {

    void sort(T[] array);


    public static void main(String[] main)   {
        Sort<String> sort = new BubbleSort<>();
        sort.sort(new String[30]);
    }


}