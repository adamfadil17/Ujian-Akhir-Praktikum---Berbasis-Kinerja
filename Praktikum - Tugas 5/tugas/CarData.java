package tugas;
import java.util.ArrayList;

public class CarData {

    private ArrayList<Car> carList = new ArrayList<Car>();

    public void addCar(String carType, String polNum, String merk){

        Car car = new Car(carType, polNum, merk, true);

        carList.add(car);
    }

    public void listOfCar(){
        System.out.println("===================================");
        System.out.println("\t\t\tDAFTAR MOBIL");
        System.out.println("===================================");

        for(Car mobil : carList){
            System.out.println("Tipe Mobil\t:\t"+mobil.getCarType());
            System.out.println("No. Polisi\t:\t"+mobil.getPolNum());
            System.out.println("Merk\t\t:\t"+mobil.getMerk());
            System.out.println("===================================");
        }
    }

    public ArrayList<Car> getCarList(){
        return carList;
    }
    
}
