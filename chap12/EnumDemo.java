package chap12;

enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo {
    public static void main(String args[]) {
        Transport tp;
        tp = Transport.AIRPLANE;
        System.out.println("Value of tp: " + tp);
        tp = Transport.TRAIN;
        if(tp == Transport.TRAIN)
            System.out.println("tp contains TRAIN.");

        switch(tp) {
            case CAR:
                break;
            case TRUCK:
                break;
            case TRAIN:
                System.out.println("BINGO!");
                break;
            default:
                break;
        }
    }
}