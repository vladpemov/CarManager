package sk.com.ymca.carmanager;

public class Car {

    String name;
     int yearOfProduction;
     int price;
     int weight;
     String color;

    public Car(String name, int yearOfProduction, int price, int weight, String color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car: " + "name = " + name + ", yearOfProduction = " + yearOfProduction + ", price = " + price +
                ", weight = " + weight + ", color = " + color ;
    }
}





