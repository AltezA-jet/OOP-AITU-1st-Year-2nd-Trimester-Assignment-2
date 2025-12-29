public class Main {
    public static void main(String[] args){
        Driver[] drivers=new Driver[5];
        drivers[0]=new Driver("Aibek", "B");
        drivers[1]=new Driver("Alina", "B");
        drivers[2]=new Driver("Temirlan", "A");
        drivers[3]=new Driver("Zhanna", "C");
        drivers[4]=new Driver("Erzhan", "C,B");

        
        Car car1 = new Car("Toyota", 2020, 4, "Gasoline", drivers[0]);
        Car car2 = new Car("BMW",1995,4,"Gasoline",drivers[1]);
        Motorcycle mot1=new Motorcycle("YAMAHA", 2016, false, drivers[2]);
        Truck truck1 = new Truck("MAN", 2000, 10.4, 4, drivers[3]);
        Car car3 = new Car("FERRARI",2022,2,"Gasoline",drivers[4]);
        Truck truck2 = new Truck("VOLVO", 2019, 9.2, 4, drivers[4]);
        
        Vehicle[] vehicles = {car1, car2, car3, mot1, truck1, truck2};
        for (Vehicle v : vehicles) {

            v.startEngine();
            v.displayInfo();
            v.stopEngine();


            if (v.driver != null) {
                System.out.println("Driver Name: " + v.driver.getName());
                System.out.println("Driver License: " + v.driver.getLicenseNumber());
            } else {
                System.out.println("No driver assigned to this vehicle.");
            }

            System.out.println("----------------------");
        }


    }
}
