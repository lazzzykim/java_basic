package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20;

        // final 지역변수2
        final int data2 = 10;
//        data2 = 20;
    }

    static void method(final int parameter) {
//        parameter = 20; 인수로 받은 값으로 고정한다.


    }
}
