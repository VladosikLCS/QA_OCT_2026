package org.prog.session7.abstraction;

public final class SomeTest extends AbstractTest {

    public void smth(){
        counter++;
        someTestMethod();
    }

    @Override
    public void absMethod() {
        System.out.println("absMethod");
    }
}
