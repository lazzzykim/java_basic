package final1.ex;

public class Member {

    private final String id; // final 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
//        this.id = id;  // final로 선언했기 때문에 중요한 id는 수정이 안됨
        this.name = name;
    }

    public void print() {
        System.out.println("id " + id + ", name " + name);
    }
}
