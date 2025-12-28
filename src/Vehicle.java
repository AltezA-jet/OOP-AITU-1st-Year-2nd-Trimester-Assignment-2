public abstract class Vehicle {
    private String brand;
    private int year;
    public Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;

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
