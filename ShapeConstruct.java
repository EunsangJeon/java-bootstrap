class TwoDimen {
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

class TriangleTwoDi extends TwoDimen {
    private String style;

    public TriangleTwoDi(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("Triangle style: " + style);
    }
}

class ShapeConstruct {
    public static void main(String args[]) {
        TriangleTwoDi t1 = new TriangleTwoDi("Notice", 10.0 , 5.0);
        System.out.println(t1.area());
        t1.showStyle();
    }
}
