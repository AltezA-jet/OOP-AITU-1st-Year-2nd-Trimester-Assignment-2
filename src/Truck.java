public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;
    public double getCapacity(){
        return capacity;
    }
    public int getNumAxles(){
        return numAxles;
    }
    public Truck(String brand, int year,double capacity,int numAxles){
        super(brand,year);
        this.capacity=capacity;
        this.numAxles=numAxles;

    }
    @Override
    void startEngine(){System.out.println("Engine Started!");}
    @Override
    void stopEngine(){System.out.println("Engine stopped!");}
}
