class VarArgOverload {
    public static void vaTest(int ... v){
        System.out.println("arg count: " + v.length);
        for (int arg : v) {
            System.out.println(arg);
        }
    }

    public static void vaTest(boolean ... v){
        System.out.println("arg count: " + v.length);
        for (boolean arg : v) {
            System.out.println(arg);
        }
    }

    public static void main(String args[]) {
        vaTest(true, false, true);
        vaTest(1, 2, 3);
    }
}
