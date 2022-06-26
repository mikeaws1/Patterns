package de.adesso.patterns.strategy;

public interface Sort<T extends Comparable<T>> {

    void sort(T[] array);

}