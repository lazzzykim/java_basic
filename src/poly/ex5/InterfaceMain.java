package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); 인터페이스 생성불가

        InterfaceAnimal dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 울음소리 시작");
        animal.sound();
        System.out.println("동물 울음소리 종료");
    }
}
