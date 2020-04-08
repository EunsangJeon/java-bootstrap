/* Display a text file.
To use this program, specify the name
of the file that you want to see.
For example, to see a file called TEST.TXT, use the following command line.
java ShowFile TEST.TXT */

package inputOutput;

import java.io.*;

public class ShowFile {
  public static void main(String args[]) {
    int i;
    FileInputStream fin = null;

    if(args.length != 1) {
      System.out.println("Usage: ShowFile File");
      return;
    }

    try {
      fin = new FileInputStream(args[0]);
      do {
        i = fin.read();
        if(i != -1) {
          System.out.print((char) i);
        }
      } while(i != -1);
    } catch(FileNotFoundException exc) {
      System.out.println("File Not Found");
      return;
    } catch(IOException exc) {
      System.out.println("Error reading file.");
    } finally {
      try {
        fin.close();
      } catch(IOException exc) {
        System.out.println("Error closing file.");
      }
    } 
  };
}