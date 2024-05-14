package discount;

public class PlatinumDiscountStrategy implements DiscountStrategy {
    public double calculateDiscount(double billAmount){
        return billAmount * 0.75;
    }
}
