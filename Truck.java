package Workshop2Car;

public class Truck extends Car {
    int weight;
    double salePrice;
    double discount = 0;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {

        if(weight>2000)
            discount = 0.10;
        else
            discount = 0.20;

        double DiscountPrice = regularPrice * discount;
        salePrice = regularPrice - DiscountPrice;
        System.out.println("Sale price for Truck is :"+salePrice);

        return salePrice;
    }
}
