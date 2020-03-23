class Outer {
    public int nums[];
    public class Inner {
        public int min() {
            int m = nums[0];
            for(int num : nums) {
                if(m > num) {
                    m = num;
                }
            }
            return m;
        }
        public int max() {
            int m = nums[0];
            for(int num: nums) {
                if(m < num) {
                    m = num;
                }
            }
            return m;
        }

    }
    public Outer(int n[]) {
        nums = n;
    }
    public void analyze() {
        Inner inOb = new Inner();
        System.out.println(inOb.min());
        System.out.println(inOb.max());
    }
}

class NestedClassDemo {
    public static void main(String args[]) {
        int x[] = { 3, 2, 1, 5, 6, 9, 7, 8 };
        Outer outOb = new Outer(x);
        outOb.analyze();
    }
}
