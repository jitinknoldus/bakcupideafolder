package Java_oops_continued.task6;

class Item
{
    double price;
    int quantity;
    Item(double price, int quantity)
    {
        this.price = price;
        this.quantity = quantity;
    }
}
public class Cart
{
    double totalPrice=0;

    double getTotal(Item item) //aggregation used
    {
        totalPrice= totalPrice+(item.quantity*item.price);
        return totalPrice;
    }
    public static void main(String args[])
    {
        Item item1 = new Item(299, 2);
        Item item2 = new Item(199, 4);
        Cart shoppingcart = new Cart();
        double total = shoppingcart.getTotal(item1)+shoppingcart.getTotal(item2);
        System.out.println("The total price of your cart is - "+total);
    }
}

