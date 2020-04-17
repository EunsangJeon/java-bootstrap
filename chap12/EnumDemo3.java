package chap12;

enum TransportCons {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); // This should come first.

    private int speed;

    TransportCons(int s){
        speed = s;
    }

    int getSpeed() {
        return speed;
    }
}

public class EnumDemo3 {
    public static void main(String args[]) {
        System.out.println("Typical speed for an airplane is " + TransportCons.AIRPLANE.getSpeed() + " mph.");
        System.out.println("All Transport speeds: ");
        for(TransportCons t : TransportCons.values()) {
            System.out.println(t + " typical speed is " + t.getSpeed() + " mph.");
        }
    }
}