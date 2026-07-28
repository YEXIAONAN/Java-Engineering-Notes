package org.code.enums;

public class Enums {
    public static void main(String[] args) {
        enum size{
            LONG,
            SMALL,
        }

        size myVar = size.LONG;
        System.out.println(myVar);
    }
}
