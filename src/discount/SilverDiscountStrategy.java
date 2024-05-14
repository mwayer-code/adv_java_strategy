package discount;

public class SilverDiscountStrategy implements DiscountStrategy{
    public double calculateDiscount(double billAmount){
        return billAmount * 0.95;
    }
}
