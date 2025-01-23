package class1.ex;

public class ProductOrderMain {

  public static void main(String[] args) {
    ProductOrder productOrder1 = new ProductOrder()
        .productName("두부")
        .price(2000)
        .quantity(2)
        .build();

    ProductOrder productOrder2 = new ProductOrder()
        .productName("김치")
        .price(5000)
        .quantity(1)
        .build();

    ProductOrder productOrder3 = new ProductOrder()
        .productName("콜라")
        .price(1500)
        .quantity(2)
        .build();

    ProductOrder[] orders = new ProductOrder[] {productOrder1, productOrder2, productOrder3};

    int totalAmount = 0;
    for (ProductOrder p : orders){
      System.out.println("상품명: " + p.getProductName() + " 가격: " + p.getPrice() + " 수량: " + p.getQuantity());
      totalAmount += p.getPrice() * p.getQuantity();
    }
    System.out.println("총 결제 금액: " + totalAmount);
  }
}
