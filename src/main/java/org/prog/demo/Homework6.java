package org.prog.demo;

public class Homework6 {

        public static void unlockAndCall(IPhone phone){
            phone.unlock();
            phone.call();
        }
    public static void main(String[] args) {
        IPhone android = new Android();
        IPhone apple = new Apple();
        unlockAndCall(android);
        unlockAndCall(apple);
    }
}