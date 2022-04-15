package tugas;
import java.util.ArrayList;

public class RentArchive {

    private ArrayList<CarRent> rentData = new ArrayList<CarRent>();

    public void Rent(CarRider rider, Car car, int rentDuration){
        
        CarRent cRent = new CarRent(rider, car, rentDuration);

        if(car.isStatus()){
            rentData.add(cRent);
            System.out.println("Mobil berhasil disewa");
            car.setStatus(String.valueOf(false));
        } else{
            System.out.println("Maaf, Mobil sudah disewa");
        }
    }

    public void info(){
        System.out.println("===================================");
        System.out.println("\t\tINFORMASI PELANGGAN");
        System.out.println("===================================");

        for(CarRent sewa : rentData){
            System.out.println("Nama Peminjam\t:\t"+sewa.getRider().getName());
            System.out.println("Tipe Mobil\t\t:\t"+sewa.getCar().getCarType());
            System.out.println("No. Polisi\t\t:\t"+sewa.getCar().getPolNum());
            System.out.println("Durasi Rental\t:\t"+sewa.getRentDuration()+" Jam");
            System.out.println("===================================");
        }
    }
    
}
