class VarArgWithStandard {
    public static void vaTest(String msg, int ... v) {
        System.out.println("args count: " + v.length + " " + msg);
        for(int arg : v){
            System.out.println(arg);
        }
    }

    public static void main(String args[]) {
        vaTest("ONE", 9);
        vaTest("THREE", 1, 2, 3);
        vaTest("ZERO");
    }
}