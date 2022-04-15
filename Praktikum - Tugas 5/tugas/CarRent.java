package tugas;

public class CarRent {

    private CarRider rider;
    private Car car;
    private int rentDuration;
    
    public CarRent(CarRider rider, Car car, int rentDuration) {
        this.rider = rider;
        this.car = car;
        this.rentDuration = rentDuration;
    }

    public CarRider getRider() {
        return rider;
    }

    public Car getCar() {
        return car;
    }

    public int getRentDuration() {
        return rentDuration;
    }
    
}
