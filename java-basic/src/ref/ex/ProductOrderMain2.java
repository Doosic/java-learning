package ref.ex;

public class ProductOrderMain2 {

  public static void main(String[] args) {
    ProductOrder[] orders = new ProductOrder[3];
    orders[0] = createOrder("두부", 2000, 2);
    orders[1] = createOrder("김치", 5000, 1);
    orders[2] = createOrder("콜라", 1500, 2);

    printOrders(orders);
    int totalAmount = getTotalAmount(orders);
    System.out.println("총 결제 금액: " + totalAmount);
  }

  static ProductOrder createOrder(String productName, int price, int quantity){
    ProductOrder order = new ProductOrder()
        .productName(productName)
        .price(price)
        .quantity(quantity)
        .build();
    return order;
  }

  static void printOrders(ProductOrder[] productOrders){
    for (ProductOrder order : productOrders){
      System.out.println("상품명: " + order.getProductName() + " 가격: " + order.getPrice() + " 수량: " + order.getQuantity());
    }
  }

  static int getTotalAmount(ProductOrder[] productOrders){
    int totalAmount = 0;
    for (ProductOrder order : productOrders){
      totalAmount += order.getPrice() * order.getQuantity();
    }
    return totalAmount;
  }

}
