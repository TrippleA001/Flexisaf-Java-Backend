//Class declearation 
class MyClass {
    // field, constructor, and 
    // method declarations
}

//Extended Class declearation


//Access Modifiers 
 class Bicycle {
        
    private int cadence;
    private int gear;
    private int speed;
        
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    public int getCadence() {
        return cadence;
    }
        
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public int getGear() {
        return gear;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public int getSpeed() {
        return speed;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
 }
 class AnotherClass {
    // field, constructor, and 
    // method declarations
//defining methods
public double calculateAnswer(double wingSpan, int numberOfEngines,
                              double length, double grossTons) {
    //do the calculation here
    calculateAnswer(double, int, double, double)

}

//Overloading methods
 class DataArtist {
    //
    public void draw(String s) {
        //
    }
    public void draw(int i) {
        //
    }
    public void draw(double f) {
        //
    }
    public void draw(int i, double f) {
        //
    }
 }
 }
//Contructors 
public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
}
Bicycle myBike = new Bicycle(30, 0, 8);

public Bicycle() {
    gear = 1;
    cadence = 10;
    speed = 0;
}
Bicycle yourBike = new Bicycle();