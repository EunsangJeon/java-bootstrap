class Factor {
    boolean isFactor(int a, int b) {
        if((b % a) == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

class IsFact {
    public static void main(String args[]) {
        Factor x = new Factor();
        System.out.println(x.isFactor(2, 20));
    }
}
