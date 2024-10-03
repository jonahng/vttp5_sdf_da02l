package object;

public class laptop extends computer {
    private String operatingSystem;
    private Integer weight;
    

    public laptop(String cpu, int memory, int rAM) {
        super(cpu, memory, rAM);
    }

    public laptop() {
    }

    public void setoperatingSystem(String os){
        this.operatingSystem = os;
    }

    public String getoperatingSystem(){
        return this.operatingSystem;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    

    
}
