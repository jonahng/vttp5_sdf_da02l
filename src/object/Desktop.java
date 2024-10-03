package object;

public class Desktop extends computer{
    private String coolingSystem;

    public Desktop(String cpu, int memory, int rAM, String coolingSystem) {
        super(cpu, memory, rAM);
        this.coolingSystem = coolingSystem;
    }

    public Desktop(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }
    



    @Override
    public void start(){
        System.out.println("Starting your desktop");
    }
    @Override
    public void shutDown(){
        System.out.println("Shutting down your desktop");
    }
    @Override //overide is used when using the same function NAME in the child class. so when the function is called it uses the overiding one.
    public void displaySpec(){
        System.out.println(this.getCpu());
        System.out.println(this.getMemory());
        System.out.println(this.getRAM());
        System.out.println("your desktop has this cooling" + this.getCoolingSystem());
}
}
