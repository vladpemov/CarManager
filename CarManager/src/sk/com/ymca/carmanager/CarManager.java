package sk.com.ymca.carmanager;

public class CarManager {
    public static void main(String[] args) {

        Car toyota = new Car("Prius",2012, 13500, 1350, "White");
        Car renaut = new Car("Laguna", 2006, 10850, 1720, "Blue");

        System.out.println(toyota + "\n" + renaut);

        Motorbike suzuki = new Motorbike("GSX-R1000", 2021, 16000,600, "black",
                "disel", true);
        Motorbike yamaha = new Motorbike("FZ1", 2007, 9000, 700, "green",
                "gas", false);

        System.out.println("\n" + suzuki + "\n" + yamaha);


    }
}
