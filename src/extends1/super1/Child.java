package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // this 생략가능 (자기자신을 지칭)
        System.out.println("super value = " + super.value); // super 부모타입을 지정

        this.hello(); // this 생략 가능
        super.hello();
    }
}
