package ch.stg.architecture.coupling.solution;

public class C {

   private final Say x;

    public C(Say x) {
        this.x = x;
    }

    public String speak() {
        return x.sayHello();
    }

}
