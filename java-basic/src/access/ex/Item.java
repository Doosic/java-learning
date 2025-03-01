package access.ex;

public class Item {
   private String name;
   private int price;
   private int quantity;

  public Item(String name, int price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  // 객체 지향적으로 생각 할 때. 내 속성을 내가 계산하는 것이 좋다.
  public int getTotalPrice(){
    return price * quantity;
  }
}
