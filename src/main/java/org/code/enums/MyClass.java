package org.code.enums;

public class MyClass {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.HIGH;
        System.out.println(myVar);
    }
}
