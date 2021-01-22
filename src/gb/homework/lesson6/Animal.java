package gb.homework.lesson6;

public abstract class Animal {
    static int animalCount = Cat.catCount + Dog.dogCount;

    public abstract void run(int meters);
    public abstract void swim(int meters);
}
