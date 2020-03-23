class VarArgMethodBasic {
    public static void vaTest(int ...v) {
        System.out.println("arg count: " + v.length);
        for (int arg : v) {
            System.out.println(arg);
        }
    }

    public static void main(String args[]) {
        vaTest(9);
        vaTest(1, 2, 3);
        vaTest();
    }
}