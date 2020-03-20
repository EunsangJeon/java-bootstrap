class FailSoftArray {
    private int a[];
    private int errval;
    public int length;

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    private boolean indexOK(int index) {
        if(index >= 0 && index < length) {
            return true;
        }
        return false;
    }

    public int get(int index) {
        if(indexOK(index)) {
            return a[index];
        }
        return errval;
    }

    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }
}

class FSDemo {
    public static void main (String args[]) {
        FailSoftArray fs = new FailSoftArray(5, -1);

        for(int i = 0; i <= 5; i++) {
            System.out.println(fs.put(i, i));
        }
        
        for(int i = 0; i <= 5; i++) {
            System.out.println(fs.get(i));
        }
    }
}
