class TwoDimenSuperConst {
    private double width;
    private double height;

    public TwoDimenSuperConst() {
        width = 0.0;
        height = 0.0;
    }

    public TwoDimenSuperConst(double w, double h) {
        width = w;
        height = h;
    }

    public TwoDimenSuperConst(double x) {
        width = x;
        height = x;
    }

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

class TriangleTwoDimenSuperConst extends TwoDimenSuperConst {
    private String style;

    public TriangleTwoDimenSuperConst() {
        super();
        style = "NONE";
    }

    public TriangleTwoDimenSuperConst(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    public TriangleTwoDimenSuperConst(double x) {
        super(x);
        style = "FILLED";
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("Triangle style: " + style);
    }
}

class ShapeConstructSuper {
    public static void main(String args[]) {
        TriangleTwoDimenSuperConst t1 = new TriangleTwoDimenSuperConst("Notice", 10.0 , 5.0);
        System.out.println(t1.area());
        t1.showStyle();
    }
}
