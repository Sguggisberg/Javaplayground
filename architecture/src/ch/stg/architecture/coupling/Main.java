package ch.stg.architecture.coupling;

import ch.stg.architecture.coupling.bad.A;
import ch.stg.architecture.coupling.solution.C;
import ch.stg.architecture.coupling.solution.D;
import ch.stg.architecture.coupling.solution.Say;

public class Main {
    public static void main(String[] args) {

        // bad
        System.out.println(new A().sayHello());

        // better

        Say d = new D();
        System.out.println(new C(d).speack());
    }
}