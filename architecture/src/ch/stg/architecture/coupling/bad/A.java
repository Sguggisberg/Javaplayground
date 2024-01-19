package ch.stg.architecture.coupling.bad;

public class A {
    private final B b;

    public A() {
        b = new B();
    }

    public String sayHello() {
        return b.sayhello();
    }
}
