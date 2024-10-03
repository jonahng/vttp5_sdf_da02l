
//constructors and getters and setters can be done in visal studio code automatically!!
//right click, source action and generate getters setters

package object;
public class computer {
    private String cpu;
    private int memory;
    private int RAM;
    public computer(String cpu, int memory, int rAM) {
        this.cpu = cpu;
        this.memory = memory;
        this.RAM = rAM;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public int getRAM() {
        return RAM;
    }
    public void setRAM(int rAM) {
        RAM = rAM;
    }

    public void start(){
        System.out.println("Starting computer!");
    }

    public void shutDown(){
        System.out.println("Shutting down com");
    }
    public void displaySpec(){
        System.out.println(this.getCpu());
        System.out.println(this.getMemory());
        System.out.println(this.getRAM());
    }
    public computer(){
        this.cpu = ("m1 i guess");
        this.memory = 64;
        this.RAM = 8;
    }
    //public computer(){
    //write in default values for the computer to take
    //}


/*         public static void main(String[] args){
            computer macbook = new computer("M1chip",512,16);
            macbook.setCpu("M3 latest");
            macbook.displaySpec();
            System.out.println("line1");
        } */
    






}
