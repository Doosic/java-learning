package ref.ex;

public class ProductOrder {
  private String productName;
  private int price;
  private int quantity;

  public ProductOrder productName(String productName){
    this.productName = productName;
    return this;
  }

  public ProductOrder price(int price){
    this.price = price;
    return this;
  }

  public ProductOrder quantity(int quantity){
    this.quantity = quantity;
    return this;
  }

  public ProductOrder build() {
    return this;
  }

  public String getProductName() {
    return productName;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }
}
