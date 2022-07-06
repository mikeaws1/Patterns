package de.patterns.delegate;

public class Vertrag implements IVertrag {

    private String vertragsnummer;

    private String name;

    private VertragDelegate vertragDelegate;

    public String getVertragsnummer() {
        return vertragsnummer;
    }

    public VertragDelegate getDelegate() {
        if (vertragDelegate == null) {
            vertragDelegate = new VertragDelegate(new Caller<>(this));
        }

        return vertragDelegate;
    }

    public void setVertragsnummer(String vertragsnummer) {
        this.vertragsnummer = vertragsnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String doSomething() {
        return getDelegate().doSomething();
    }
}
