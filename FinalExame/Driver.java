package FinalExame;

import java.util.ArrayList;
import java.util.Collections;


//        -In a different method go through the ArrayList and call the accelerate() method from each object
// Lighter vehicles are greaterthan heavier vehicles. That means, anascendant order by weight.



public class Driver {

    private int sortedWeightPounds;
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

        public void addVehicle (Vehicle v) {
                vehicleArrayList.add(v);
        }

    public void printVehicle () {
        System.out.println(vehicleArrayList);
    }


    public void sort(){
        Collections.shuffle(vehicleArrayList);
        sortedWeightPounds = vehicleArrayList.get(0).getWeightPounds();
    }

    public void callMethod(Vehicle v){
            for (int i = 0; i < vehicleArrayList.size(); i++){
                System.out.println(vehicleArrayList);
                v.accelerate();
            }
    }


    public static void main(String[] args) {
        Driver d = new Driver();
        Car car1 = new Car(100);
        d.addVehicle(car1);
        d.callMethod(car1);
        Car car2 = new Car(200);
        d.addVehicle(car2);
        d.callMethod(car2);
        Car car3 = new Car(300);
        d.addVehicle(car3);
        d.callMethod(car3);
        Boat boat1 = new Boat(400);
        d.addVehicle(boat1);
        d.callMethod(boat1);
        Boat boat2 = new Boat(500);
        d.addVehicle(boat2);
        d.callMethod(boat2);
        Boat boat3 = new Boat(600);
        d.addVehicle(boat3);
        d.callMethod(boat3);
        d.printVehicle();
        d.sort();
        d.printVehicle();



    }
}
