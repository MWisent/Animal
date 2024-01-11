package com.animal;


public class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void displayAllAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println("--------------------------------");
            animal.speak();
            System.out.println("--------------------------------");
            animal.makeMove(5);
            System.out.println("--------------------------------");
            animal.toString();
        }
    }

}
