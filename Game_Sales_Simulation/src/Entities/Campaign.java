package Entities;


public class Campaign extends Game {

    private double discountRate;
    private double discountedPrice;

    public Campaign(String name, double price, double discountRate) {
        super(name, price);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }

    public double getDiscountedPrice() {
        return this.price - (this.price * this.discountRate / 100);
    }


}





