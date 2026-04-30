package org.code.oop;

class PolyAnimal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class PolyPig extends PolyAnimal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class PolyDog extends PolyAnimal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class MyMainClass {
    public static void main(String[] args) {
        PolyAnimal myAnimal = new PolyAnimal();
        PolyAnimal myPig = new PolyPig();
        PolyAnimal myDog = new PolyDog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
