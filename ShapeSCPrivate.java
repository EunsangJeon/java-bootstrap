class TwoDShape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }
}

class TriangleTwoD extends TwoDShape {
    public double area() {
        return getWidth() * getHeight() / 2;
    }
}

class ShapeSCPrivate {
    public static void main(String args[]){
        TriangleTwoD t1 = new TriangleTwoD();
        t1.setHeight(5);
        t1.setWidth(10);

        System.out.println(t1.area());
    }
}