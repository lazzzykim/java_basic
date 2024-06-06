package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 혹은 같은패키지니까 가능
//        defaultValue = 1; // 다른패키지 접근 불가, 컴파일 에러
//        privateValue = 1; // 접근 불가, 컴파일 에러

        publicMethod();
        setProtectedMethod(); // 상속이기에 패키지가 달라도 허용
//        defaultMethod();
//        privateMethod();

        printParent();
    }

}
