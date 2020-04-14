package inputOutput;

import java.io.*;

public class KtoD {
    public static void main(String args[]) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text ('stop' to quit).");

        try(FileWriter fw = new FileWriter("./inputOutput/test.txt")){
            do {
                System.out.print(": ");
                str = br.readLine();

                if(str.equals("stop")){
                    break;
                }
                str = str + "\r\n";
                fw.write(str);
            } while(!str.equals("stop"));
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}