package chap12;

public class EnumDemo4 {
    public static void main(String args[]) {
        Transport tp1, tp2, tp3;
        System.out.println("Here are all Transport constants and their ordinal values:");
        for(Transport t : Transport.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        tp1 = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        if(tp1.compareTo(tp2) < 0) {
            System.out.println(tp1 + " comes before " + tp2);
        }
        if(tp2.compareTo(tp3) == 0) {
            System.out.println(tp1 + " equals " + tp3);
        }
    }
}