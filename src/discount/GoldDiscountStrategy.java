package discount;

public class GoldDiscountStrategy implements DiscountStrategy{
    public double calculateDiscount(double billAmount){
        return billAmount * 0.85;
    }
}
