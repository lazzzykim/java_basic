package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected  int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void setProtectedMethod() {
        System.out.println("Parent.setProtectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() {
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("publicValue = " + privateValue);

        // 부모 메서드 안에서 모두 접근
        defaultMethod();
        privateMethod();
    }
}
