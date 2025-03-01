package access.ex;

public class ShoppingCartMain {

  public static void main(String[] args) {
    ShoppingCart shoppingCart = new ShoppingCart();

    Item item1 = new Item("상추", 2000, 2);
    Item item2 = new Item("배추", 5000, 1);

    shoppingCart.addItem(item1);
    shoppingCart.addItem(item2);

    shoppingCart.displayItems();
  }
}
