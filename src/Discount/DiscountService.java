package Discount;

public class DiscountService {

    public double calculateDiscountPrice(Client client, double price){
       if(client.isClientPremium())
           return calculatePremiumDiscount(price);  // jeżeli jest premium liczymy rabat premium z ceny
       else{
           return calculateStandardDiscount(price); // jeżeli jest standard liczymy rabat standard z ceny
       }
    }
    private double calculateStandardDiscount(double price){
        if(price > 1000){
          return applyDiscount( price , 0.1);
        } else{
            return price;
        }
    }
    private double calculatePremiumDiscount(double price){
        if(price > 1000){
            return applyDiscount( price , 0.15);
        } else{
            return applyDiscount( price , 0.05);
        }
    }
    private double applyDiscount ( double price, double discount){     // zaplikuj zniżkę licząc od ceny rabat
        return price * (1 - discount);
    }

}
