package inputOutput;

import java.io.*;

public class RandomAccessDemo {
    public static void main(String args[]) {
        double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;

        try(RandomAccessFile raf = new RandomAccessFile("./inputOutput/random.dat", "rw")){
            for(double datum : data) {
                raf.writeDouble(datum);
            }

            raf.seek(0); // seek to first double and set pointer
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8);
            d = raf.readDouble();
            System.out.println("Second value is " + d);
            
            raf.seek(8 * 3);
            d = raf.readDouble();
            System.out.println("Fourth value is " + d);

            System.out.println();

            System.out.println("Here is every other value: ");

            for(int i = 0; i < data.length; i += 2) {
                raf.seek(i * 8);
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}