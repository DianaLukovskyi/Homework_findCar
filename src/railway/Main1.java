package railway;

public class Main1 {
    public static void main(String[] args) {

       String [] salon = {"Audi ", "BMW ", "Ford ", "Honda ", "Hyundai ", "Kia ", "Mazda "};
       FindCar findCar = new FindCar(salon);

       findCar.carInStock("Audi");


    }

}
