package de.patterns.delegate;

public class Caller<T extends IVertrag> {

    private final T object;

    public Caller(T caller) {
        this.object = caller;
    }

    public T getObject() {
        return object;
    }
}
