package railway;

public class FindCar {
    private String[] carSalon;

    public FindCar(String[] carSalon){
        this.carSalon =carSalon;
}
public  void carInStock (String findCar){
        Boolean carInStock = false;
        for (String car : carSalon) {
            if(car.equals(findCar));
            carInStock = true;
            break;





        }
        if (carInStock){
            System.out.println(" This car in stock");

        }else {
            System.out.println("This car not in the stock , you can take..");
            for (String car : carSalon){
                System.out.println(car);
            }
            System.out.println();
        }















    }



    }











