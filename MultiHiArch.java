class ShapeMulti {
    private double width;
    private double height;

    public ShapeMulti() {
        width = height = 0.0;
    }

    public ShapeMulti(double w, double h) {
        width = w;
        height = h;
    }

    public ShapeMulti(double x) {
        width = height = x;
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

class TriangleMulti extends ShapeMulti {
    private String style;

    public TriangleMulti() {
        super();
        style = "none";
    }

    public TriangleMulti(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    public TriangleMulti(double x) {
        super(x);
        style = "filled";
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("Trianble Style: " + style);
    }
}

class ColorTriangleMulti extends TriangleMulti {
    private String color;

    public ColorTriangleMulti(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    public String getColor() {
        return color;
    }
}

class MulitHiArch {
    public static void main(String args[]) {
        ColorTriangleMulti t1 = new ColorTriangleMulti("Blue", "outlined", 9.0, 12.0);
        t1.showStyle();
        System.out.println(t1.getColor());
    }
}
