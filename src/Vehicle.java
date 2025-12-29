public abstract class Vehicle {
    private String brand;
    private int year;
    protected  Driver driver;
    public Vehicle(String brand,int year, Driver driver){
        this.brand=brand;
        this.year=year;
        this.driver = driver;
        if (driver != null) {
            driver.addVehicle(this);
        }

    }
    abstract void startEngine();
    abstract void stopEngine();
    public String getbrand(){
        return brand;
    }
    public int getyear(){
        return year;
    }
    void displayInfo(){
        System.out.println(brand+" "+year);
    }
    
}
