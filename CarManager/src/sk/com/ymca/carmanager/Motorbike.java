package sk.com.ymca.carmanager;

public class Motorbike {

    String name;
    int yearOfProduction;
    int price;
    int weight;
    String color;
    String engineType;
    boolean isReadyToDrive;

    public Motorbike(String name, int yearOfProduction, int price, int weight, String color, String engineType, boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
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

    public String getEngineType() {
        return engineType;
    }

    public boolean isReadyToDrive() {
        return isReadyToDrive;
    }

    @Override
    public String toString() {
        return "Motorbike: " +
                "name = " + name + ", yearOfProduction = " + yearOfProduction + ", price = " + price + ", weight = " + weight +
                ", color = " + color + ", engineType = " + engineType + ", Ready to drive = " + isReadyToDrive;
    }
}


