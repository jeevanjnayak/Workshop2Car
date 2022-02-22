package Workshop2Car;

public class MyOwnAutoShop {
    public static void main(String[] args) {

        Car truck = new Truck(140, 5000000, "Orange", 1000);
        truck.getSalePrice();

        Car ford1 = new Ford(180, 1400000, "White", 2021, 90000);
        ford1.getSalePrice();

        Car ford2 = new Ford(180, 1400000, "Red", 2022,110000);
        ford2.getSalePrice();

        Car sedan = new Sedan(220, 1800000, "Black", 10);
        sedan.getSalePrice();
    }
}
