package org.prog.session7.abstraction;

public abstract class AbstractTest {

    public int counter;

    public final void someTestMethod(){
        System.out.println("Hello test!");
    }

    public abstract void absMethod();
}
