package ch.stg.architecture.coupling.solution;

public class C {

   private final Say x;

    public C(Say x) {
        this.x = x;
    }

    public String speack() {
        return x.sayHello();
    }

}
