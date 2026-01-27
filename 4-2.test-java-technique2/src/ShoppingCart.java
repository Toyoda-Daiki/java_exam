import java.util.LinkedList;

public class ShoppingCart extends LinkedList<Item> {

  public int getTotalPrice() {
    int total = 0;
    for (Item item : this) {
      total += item.getPrice();
    }
    return total;
  }

  public int getAveragePrice() {
    if (this.size() == 0) {
      return 0;
    }
    return getTotalPrice() / this.size();
  }
}
