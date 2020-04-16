package multithread;

class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if(!running) {
            state = "ticked";
            notify();
            return;
        }

        System.out.print("Tick ");
        state = "ticked";
        notify();
        try {
            
        }
    }
}

public class ThreadCom {

}