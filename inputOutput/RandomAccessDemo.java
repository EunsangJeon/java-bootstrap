package inputOutput;

public class RandomAccessDemo {
    public static void main(String args[]) {
        double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;

        try(RandomAccessFile raf = new RandomAccessFile("./inputOutput/random.dat", "rw")){
            for(double datum : data) {
                raf.writeDouble(datum);
            }

            raf.seek(0); // seek to first double and set pointer
            d = raf.readDoube();
        }
    }
}