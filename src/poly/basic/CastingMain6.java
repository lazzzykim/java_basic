package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }

//     jdk 16버전에서는 instanceOf에 변수선언까지 가능하다.
//    private static void call(Parent parent) {
//        parent.parentMethod();
//// child 인스턴스 인경우 childMethod() 실행
//        if (parent instanceof Child child) {
//            System.out.println("Child 인스턴스 맞음");
//            child.childMethod();
//        }
//    }
}
