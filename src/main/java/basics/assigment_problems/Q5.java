package src.main.java.basics.assigment_problems;
class Cart {
    private final String cartId;
    private final double[] prices;
    private int count;

    public Cart(String cartId, int capacity) {
        this.cartId = cartId;
        prices = new double[capacity];
        count = 0;
    }

    public void addItem(double price) {
        if (price > 0 && count < prices.length) {
            prices[count] = price;
            count++;
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            total += prices[i];
        }

        return total;
    }

    public int getItemCount() {
        int itemCount = 0;

        for (int i = 0; i < count; i++) {
            itemCount++;
        }

        return itemCount;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println(cart.getTotal());
        System.out.println(cart.getItemCount());
    }
}