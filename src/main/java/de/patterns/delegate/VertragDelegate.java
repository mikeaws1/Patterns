package de.patterns.delegate;

public class VertragDelegate {

    private final Caller<IVertrag> caller;
    public VertragDelegate(Caller<IVertrag> c) {
        this.caller = c;
    }


    public String doSomething() {
        return caller.getObject().getVertragsnummer() + "-mysuffix";
    }

}
