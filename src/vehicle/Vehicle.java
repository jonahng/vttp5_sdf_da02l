package vehicle;
//add implements Ivehicle to add the interface. Then right click and quick fix
public class Vehicle implements IVehicle {
    private String model;
    private int horsepower;
    public Vehicle(String model, int horsepower) {
        this.model = model;
        this.horsepower = horsepower;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getHorsepower() {
        return horsepower;
    }
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void start() {
        // TODO Auto-generated method stub
        System.out.println("vehicle started")
    }
    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }
    @Override
    public void accelerate(Integer increment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accelerate'");
    }
    @Override
    public void honk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'honk'");
    }
}
