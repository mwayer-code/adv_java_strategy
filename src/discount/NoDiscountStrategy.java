package discount;

public class NoDiscountStrategy implements DiscountStrategy{
    public double calculateDiscount(double billAmount){
        return 0;
    }
}
