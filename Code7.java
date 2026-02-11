import java.util.HashSet;

public class Code7{
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);

    }
}

