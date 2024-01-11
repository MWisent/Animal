package com.animal;

public class Dog extends Animal {
    private double brakeVolume;
    private String breed;

    public Dog() {
        super(AnimalSize.MEDIUM, 30);
        this.breed = "Labrador";
        this.brakeVolume = 5.5;
    }

    public Dog(AnimalSize size, double weight, double brakeVolume, String breed) {
        super(size, weight);
        this.brakeVolume = brakeVolume;
        this.breed = breed;
    }

    public Dog(double weight, double brakeVolume, String breed) {
        super(determineSizeBasedOnWeight(weight), weight);
        this.brakeVolume = brakeVolume;
        this.breed = breed;

    }

    private static AnimalSize determineSizeBasedOnWeight(double weight) {
        if (weight <= 10) {
            return AnimalSize.SMALL;
        } else if (weight <= 25) {
            return AnimalSize.MEDIUM;
        } else {
            return AnimalSize.BIG;
        }
    }

    public double getBrakeVolume() {
        return brakeVolume;
    }

    public void setBrakeVolume(double brakeVolume) {
        this.brakeVolume = brakeVolume;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark(double brakeVolume, AnimalSize size) {
        if (brakeVolume <= 5.5 || size == AnimalSize.SMALL) {
            System.out.println("Hał hał hał...");
        } else if (brakeVolume <= 10.5 || size == AnimalSize.MEDIUM) {
            System.out.println("Hałłłłł Hałłłłł !!");
        } else {
            System.out.println("HAŁŁŁŁ RRRRRR RRRR RRRR RRRR RRRR RRRR R");
        }
    }

    public void run() {
        System.out.println("Pies piebnie");
    }
    public void walk() {
        System.out.println("Pies spaceruje");
    }
    public void wagTail() {
        System.out.println("Pies merda ogonem");
    }
    @Override
    public void speak() {
        bark(5.5, AnimalSize.SMALL);
    }

    @Override
    public void makeMove(int speed) {
        if (speed <= 5) {
            walk();
            wagTail();
        } else {
            run();
            bark(5.5, AnimalSize.SMALL);
        }
        super.makeMove(5);
    }

    @Override
    public String toString() {
        return super.toString() + "Dog{" +
                "brakeVolume=" + brakeVolume +
                ", breed='" + breed + '\'' +
                '}';
    }
}
