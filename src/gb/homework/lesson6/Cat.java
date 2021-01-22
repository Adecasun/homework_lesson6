package gb.homework.lesson6;

public class Cat extends Animal {
    static int catCount = 0;
    Cat(){
        catCount++;
    }

    @Override
    public void run(int meters) {
        if (meters < 0) {
            System.out.println("Расстояние не может быть отрицательным");
        }
        if (meters <= 200 && meters > 0) {
            System.out.println("Кошка пробежала: " + meters);
        }
        if (meters > 200) {
            System.out.println("Кошка не может пробежать " + meters + " метров");
        }

    }

    @Override
    public void swim(int meters) {
        System.out.println("Кошка не умеет плавать");

    }


}
