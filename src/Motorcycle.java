public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    public boolean getHasSidecar(){
        return hasSidecar;
    }
    public Motorcycle(String brand, int year,boolean hasSidecar,Driver driver){
        super(brand, year,driver);
        this.hasSidecar=hasSidecar;
        
    }
    @Override
    void startEngine(){System.out.println("Engine Started!");}
    @Override
    void stopEngine(){System.out.println("Engine stopped!");}

}
