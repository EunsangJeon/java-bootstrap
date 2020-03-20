class Block {
    private int a, b, c;
    private int volume;

    public Block(int i, int j, int k) {
        a = i;
        b = j;
        c= k;
        volume = a * b * c;
    }

    public boolean sameBlock(Block ob) {
        if(ob.a == a && ob.b == b && ob.c == c) {
            return true;
        }
        return false;
    }

    public boolean sameVolume(Block ob) {
        if(ob.volume == volume) {
            return true;
        }
        return false;
    }
}

class PassOb {
    public static void main(String args[]) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        // Block ob4 = new Block();

        System.out.println(ob1.sameBlock(ob2));
        System.out.println(ob1.sameBlock(ob3));
        System.out.println(ob1.sameVolume(ob3));
    }
}
