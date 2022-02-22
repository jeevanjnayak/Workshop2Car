package Workshop2Car;

public class Ford extends Car {
    private static double manufacturingDiscount;
    private static int year;
    double salePrice;
    ;

    public Ford(int speed, double regularPrice, String color,int year, long manufacturingDiscount) {
        super(speed, regularPrice, color);
        Ford.manufacturingDiscount = manufacturingDiscount;
        Ford.year = year;
    }

    @Override
    double getSalePrice() {

        salePrice = regularPrice - Ford.manufacturingDiscount;
        System.out.println("sale price for Ford for " +year+ " is : "+salePrice+ "\n");
        return salePrice;
    }
}
