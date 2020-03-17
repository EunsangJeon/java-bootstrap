/*
When you compile this program,
you will find that two .class files have been created,
one for Vehicle and one for VehicleDemo.
Of course, you can seperate both classes in file level and compile.
*/
class Vehicle {
    int passengers; // # of pessanger
    int fuelcap; // fuel capacity
    int mpg; // mile per gallon
}

class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;

        System.out.println("Minivan can run " + range + " miles");
    }
}