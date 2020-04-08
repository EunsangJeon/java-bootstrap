package inputOutput;

import java.io.*;

public class ReadBytes {
  public static void main(String args[]) throws IOException {
    byte data[] = new byte[10];
    System.out.println("Enter some characters");
    System.in.read(data);
    System.out.println("You entered: ");
    for(byte datum : data) {
      System.out.println((char) datum);
    }
  }
}