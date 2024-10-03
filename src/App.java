import java.util.ArrayList;
import java.util.List;

import object.Desktop;
import object.computer;
public class App {
    public static void main(String[] args){
        computer macbook1 = new computer();
        macbook1.setCpu("m2 chip");
        macbook1.setMemory(256);
        macbook1.setRAM(8);
        macbook1.start();
        macbook1.shutDown();
        macbook1.displaySpec(); 


        Desktop desktop1 = new Desktop("Water heatpipe");

        desktop1.setCpu("m2 chip");
        desktop1.setMemory(256);
        desktop1.setRAM(8);
        desktop1.start();
        desktop1.shutDown();
        desktop1.displaySpec();

        List<computer> machines = new ArrayList<>();
        machines.add(macbook1);
        machines.add(desktop1);

        for(computer computer: machines){
            System.out.println("Your com has these specifications!" );
            computer.displaySpec();
        }


    }
}
