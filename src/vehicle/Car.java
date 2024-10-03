package vehicle;

public class Car extends Vehicle{
    public String carType;
    public Integer capacity;
    public Integer speed;
    public Car(String model, int horsepower, String carType, Integer capacity, Integer speed) {
        super(model, horsepower);
        this.carType = carType;
        this.capacity = capacity;
        this.speed = speed;

    }/*  */
    public Car() {
        //TODO Auto-generated constructor stub
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public Integer getCapacity() {
        return capacity;
    }
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("car is going vrooom vehicle started")
    public static void main(String[] args){
        Car mrbeancar = new Car();
        mrbeancar.start();
    }
}
