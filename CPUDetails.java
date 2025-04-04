package Naseena;

public class CPUDetails {
    double price;
    
    class Processor {
        double cores;
        String manufacturer;
        
        double getCache() {
            return 4.3;
        }
    }
    
    static class RAM {
        double memory;
        String manufacturer;
        
        double getClockSpeed() {
            return 5.5;
        }
    }
    
    public static void main(String[] args) {
        // Create an instance of CPUDetails to access non-static inner class Processor
        CPUDetails cpuDetails = new CPUDetails();
        
        // Instantiate the non-static inner class Processor
        CPUDetails.Processor processor = cpuDetails.new Processor();
        
        // Instantiate the static inner class RAM
        CPUDetails.RAM ram = new CPUDetails.RAM();
        
        // Output results
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("RAM Clock Speed = " + ram.getClockSpeed());
    }
}
