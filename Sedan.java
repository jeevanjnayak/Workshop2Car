package Workshop2Car;

public class Sedan extends Car {
    int length;
    double salePrice;
    double discount = 0

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        double discountPrice;

        if(length > 20)
            discount = 0.05;
        else
            discount = 0.10;

        discountPrice = regularPrice * discount;
        salePrice = regularPrice - discountPrice;
        System.out.println("sale price for Sedan is : "+salePrice);

        return salePrice;
    }
}
