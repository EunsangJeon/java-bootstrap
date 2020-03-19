class Power {
    double b;
    int e;
    double val;

    Power(double base, int exp) {
        b = base;
        e = exp;
        val = 1;

        if(exp == 0){
            return;
        }

        while(exp > 0){
            exp--;
            val *= base;
        }
    }

    double get_power() {
        return val;
    }
}

class DemoPower {
    public static void main(String args[]) {
        Power x = new Power(5.7, 3);
        System.out.println(x.val);
    }
}
