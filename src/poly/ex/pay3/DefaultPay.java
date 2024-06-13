package poly.ex.pay3;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제수단이 잘못되었습니다.");
        return false;
    }
}
