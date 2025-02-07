package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("입력할 주문의 개수를 입력하세요: ");
    int orderNum = sc.nextInt();
    sc.nextLine();

    ProductOrder[] orders = new ProductOrder[orderNum];
    for(int i = 0; i < orderNum; i++){
      System.out.println(i + "번째 주문 정보를 입력하세요.");
      System.out.println("상품명: ");
      String productName = sc.nextLine();

      System.out.println("가격: ");
      int price = sc.nextInt();

      System.out.println("수량: ");
      int quetity = sc.nextInt();
      sc.nextLine(); // 입력 버퍼를 비우기 위한 코드

      orders[i] = createOrder(productName, price, quetity);
    }

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
