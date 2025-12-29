package generaltasksforOOP;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingCart {
    CartItem[] carditem;

    public ShoppingCart() {
    }

    public ShoppingCart(CartItem[] carditem) {
        this.carditem = carditem;
    }

    public CartItem[] getCarditem() {
        return carditem;
    }

    public void setCarditem(CartItem[] carditem) {
        this.carditem = carditem;
    }

    public CartItem addItem(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = input.nextLine();
        System.out.print("Enter product price: ");
        double price = input.nextDouble();
        System.out.print("Enter product quantity: ");
        int quantity = input.nextInt();

        for (int i = 0; i < carditem.length; i++) {
            if (carditem[i] == null) {

                Product product = new Product(name,price);
                CartItem item = new CartItem(product,quantity);
                carditem[i] = item;
                //break;
                System.out.println("Product added successfully");
                System.out.println(item);
                return  item;

            }

        }
        System.out.println("The array is full ");
        return null;
    }

    public void removeItem(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = input.nextLine();

        for(int i = 0; i < carditem.length; i++){
            if (carditem[i]!=null && carditem[i].getProduct().getName().equals(name)){
                carditem[i] =  null;
                System.out.println("Product removed successfully");
             break;
            }
        }
        System.out.println("There is no product with the name " + name);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "carditem=" + Arrays.toString(carditem) +
                '}';
    }

    public void getTotalPrice(){
        double totalPrice = 0;
        boolean hasitem = false;
        for(int i = 0; i < carditem.length; i++){
            if(carditem[i]!=null){
               if (!hasitem){
                  hasitem = true;}
            totalPrice += carditem[i].getProduct().getPrice()*carditem[i].getQuantity();
            System.out.println("The total price is " + totalPrice);
            }}
            if(hasitem == false) {
                System.out.println("There is no product ");

            }
    }


}
