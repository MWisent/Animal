package com.animal;

public class Animal {
    private AnimalSize size;
    private double weight;

    public Animal() {
        this.size = AnimalSize.SMALL;
        this.weight = 30;
    }

    public Animal(AnimalSize size, double weight) {
        this.size = size;
        this.weight = weight;
    }
    public AnimalSize getSize() {
        return size;
    }

    public void setSize(AnimalSize size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void speak() {
        System.out.println("Zwierzę wydaje dźwięk");
    }
    public void makeMove(int speed) {
        System.out.println("Zwierzęta poruszajął z predkościął " + speed);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", weight=" + weight +
                '}';
    }
}
