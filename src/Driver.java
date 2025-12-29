import java.util.ArrayList;
import java.util.List;

public class Driver {
    private String name;
    private String licenseNumber;
    private List<Vehicle> vehicles;
    public Driver(String name,String licenseNumber ){
        this.licenseNumber=licenseNumber;
        this.name=name;
        this.vehicles = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public String getName(){
        return name;
    }
    public String getLicenseNumber(){
        return licenseNumber;
    }
    public void displayDriverInfo(){
        System.out.println(name+" "+licenseNumber);
        if (!vehicles.isEmpty()) {
            System.out.println("Associated vehicles:");
            for (Vehicle v : vehicles) {
                v.displayInfo();
            }
        }
    }
}
