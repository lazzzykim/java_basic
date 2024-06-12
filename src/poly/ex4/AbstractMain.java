package poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        // 추상클래스는 생성이 불가능하다.
//        AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 울음소리 시작");
        animal.sound();
        System.out.println("동물 울음소리 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 시작 ");
        animal.move();
        System.out.println("동물 이동 종료");
    }
}
