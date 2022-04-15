package tugas;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nama\t:\tAdam Fadilah Islamawan");
        System.out.println("NIM\t\t:\t215150700111017");
        System.out.println("Kelas\t:\tTI-A");


        CarData list = new CarData();

        list.addCar("A-Class", "N 768 GK", "Mercedes");
        list.addCar("Aventador", "N 345 GU", "Lamborghini");
        list.addCar("Jesko Absolut", "N 456 GP", "Koenigsegg");
        list.addCar("DB II", "N 435 JK", "Aston Martin");

        list.listOfCar();
        System.out.println("");

        CarRider rider1 = new CarRider("Marc Marquez", 26 , "081332564678");
        CarRider rider2 = new CarRider("Alex Rins", 24, "0896574563675");
        CarRider rider3 = new CarRider("Fabio Quartararo", 25, "082333033585");
        CarRider rider4 = new CarRider("Enea Bastinini", 23, "085467567345");

        RentArchive arch = new RentArchive();
        arch.Rent(rider1, list.getCarList().get(3), 24);
        arch.Rent(rider2, list.getCarList().get(1), 10);
        arch.Rent(rider3, list.getCarList().get(1), 5);
        arch.Rent(rider4, list.getCarList().get(2), 3);
        System.out.printf("\n");

        arch.info();
    }
}
