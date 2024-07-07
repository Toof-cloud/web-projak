public class Poly {

        public static void main(String args[]){
        
            Car car = new Car();
            Bicycle bicycle = new Bicycle();
            boat boat = new boat();
            
            Vehicle[] racers = {car, bicycle, boat};

            boat.go();
            bicycle.go();
            car.go();

            for(Vehicle x : racers){
                x.go();
            }
        }
}
class Vehicle{

    public void go(){

    }
}
class boat extends Vehicle{
    @Override
    public void go(){
        System.out.println("The boat is now moving");
    }
}
class Car extends Vehicle{
    @Override
    public void go(){
        System.out.println("The car is now moving");
    }
}
class Bicycle extends Vehicle{
    @Override
    public void go(){
        System.out.println("The Bicycle is now moving");
    }
}