class AccessTestCow {
    private int alpha;
    
    public void setAlpha(int a) {
        alpha = a;
    }

    public int getAlpha() {
        return alpha;
    }
}

class AcessDemo {
    public static void main(String args[]) {
        AccessTestCow cow = new AccessTestCow();

        cow.setAlpha(9);
        System.out.println(cow.getAlpha());
    }
}