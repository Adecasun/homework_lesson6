package gb.homework.lesson6;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        Dog bobik = new Dog();


        barsik.run(100);
        barsik.swim(400);
        bobik.run(50);
        bobik.swim(6);

        System.out.println(Cat.catCount);
        System.out.println(Dog.dogCount);
        System.out.println(Animal.animalCount);





    }
}
