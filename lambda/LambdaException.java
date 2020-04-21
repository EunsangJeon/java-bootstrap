package lambda;

import java.io.*;

interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}

public class LambdaException {
    public static void main(String args[]) {
        double[] value = {1.0, 2.0, 3.0, 4.0};
        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read();
            return true;
        };
    }
}