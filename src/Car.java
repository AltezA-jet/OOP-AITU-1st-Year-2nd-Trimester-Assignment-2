public class Car extends Vehicle{
    private int doors;
    private String fuelType;
    public int getDoors(){
        return doors;
    }
    public String getFuelType(){
        return fuelType;
    }

    public Car(String brand, int year,int doors,String fuelType,Driver driver){
        super(brand,year,driver);
        this.doors=doors;    
        this.fuelType=fuelType;
        
    }
    @Override
    void startEngine(){System.out.println("Engine Started!");}
    @Override
    void stopEngine(){System.out.println("Engine stopped!");}

    }