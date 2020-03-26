class ShapeMethOver {
    private double width;
    private double height;
    private String name;
    
    public ShapeMethOver() {
        width = height = 0.0;
        name = "none";
    }

    public ShapeMethOver(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    public ShapeMethOver(ShapeMethOver ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public double area() {
        System.out.println("Not a certain shape");
        return 0.0;
    }
}

class TriangleMethOver extends ShapeMethOver {
    public TriangleMethOver(double w, double h) {
        super(w, h, "triangle");
    }

    public TriangleMethOver(TriangleMethOver tr) {
        super(tr);
    }

    public double area() {
        return getHeight() * getWidth() / 2;
    }
}

class RectangleMethOver extends ShapeMethOver {
    public RectangleMethOver(double w, double h) {
        super(w, h, "rectangle");
    }

    public RectangleMethOver(RectangleMethOver rt) {
        super(rt);
    }

    public double area() {
        return getHeight() * getWidth();
    }
}

class MethodOverShape {
    public static void main(String args[]) {
        TriangleMethOver tr = new TriangleMethOver(5, 10);
        RectangleMethOver rt = new RectangleMethOver(5,10);

        System.out.println(tr.area() + " " + rt.area());
    }
}
