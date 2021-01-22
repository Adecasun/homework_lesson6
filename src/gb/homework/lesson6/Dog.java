package gb.homework.lesson6;

public class Dog extends Animal{
    static int dogCount = 0;
    Dog(){
        dogCount++;
    }
    @Override
    public void run(int meters) {
        if (meters < 0) {
            System.out.println("Расстояние не может быть отрицательным");
        }
        if (meters <= 200 && meters > 0) {
            System.out.println("Собака пробежала: " + meters + " метров");
        }
        if (meters > 500) {
            System.out.println("Собака не может пробежать " + meters + " метров");
        }

    }

    @Override
    public void swim(int meters) {
        if (meters < 0) {
            System.out.println("Расстояние не может быть отрицательным");
        }
        if (meters <= 10 && meters > 0) {
            System.out.println("Собака проплыла: " + meters + " метров");
        }
        if (meters > 10) {
            System.out.println("Собака не может проплыть " + meters + " метров");
        }


    }
}
