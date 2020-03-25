class UpperClassChap7 {
    public int i;
}

class DownClassChap7 extends UpperClassChap7{
    public int i;

    public DownClassChap7(int a, int b) {
        super.i = a;
        i = b;
    }

    public void show() {
        System.out.println(super.i);
        System.out.println(i);
    }
}

class SuperClassMember {
    public static void main(String args[]){
        DownClassChap7 ob = new DownClassChap7(1, 2);
        ob.show();
    }
}