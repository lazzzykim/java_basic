package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public void addItem(Item item) {
        int totalPrice = item.price * item.quantity;
        System.out.println("상품명: " + item.name + "합계: " + totalPrice);
    }
}
