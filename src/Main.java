import com.animal.*;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(AnimalSize.SMALL, 30.2);
        Animal animal2 = new Animal(AnimalSize.MEDIUM, 20.2);

        Dog dog = new Dog(AnimalSize.SMALL, 30.2, 5.5, "Labrador");
        Dog dog2 = new Dog(AnimalSize.BIG, 80.0, 10.5, "Dog Niemiecki");

        Fish fish = new Fish(4, 40.0);
        Fish fish2 = new Fish(5, 1);

        Animal[] animals = {dog, dog2, fish, fish2, animal, animal2};

        Zoo zoo = new Zoo(animals);

        zoo.displayAllAnimals();


    }
}