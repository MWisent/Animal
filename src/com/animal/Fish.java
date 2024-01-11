package com.animal;

public class Fish extends Animal {
    private int fins;

    public Fish(int fins, double weight) {
        super(AnimalSize.SMALL, weight);
        this.fins = fins;

    }
    public int getFins() {
        return this.fins;
    }
    public void setFins(int fins) {
        this.fins = fins;
    }
    @Override
    public void speak() {
        System.out.println("Ryba robi bul bul");
    }

    public void moveFins() {
        System.out.println("Ryba porusza płetwami" + this.fins);
    }

    @Override
    public void makeMove(int speed) {
        moveFins();
        super.makeMove(speed);
    }
    @Override
    public String toString() {
        return super.toString() + "Fish{" +
                "fins=" + fins +
                '}';
    }
}
