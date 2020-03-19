class ParCons {
    int x;
    ParCons(int y){
        x = y;
    } 
}

class ParmConsDemo {
    public static void main(String args[]) {
        ParCons ParmClass = new ParCons(9);
        System.out.println(ParmClass.x);
    }
}