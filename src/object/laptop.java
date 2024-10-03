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

    public Integer computeArithmatic(){
        Integer a =1;
        Integer b =2;
        Integer sum;

        sum = a + b;

        return sum;

    }
//overloading, this allows you to make one method like computeArithmatic with a default process and another one where it performs a different function when parameters are included.
    public Integer computeArithmatic(Integer a, Integer b){
        Integer sum;

        sum = a + b;

        return sum;

    }

    
}
