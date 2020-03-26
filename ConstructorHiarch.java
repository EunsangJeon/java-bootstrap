class ShapeConstHi {
    private double width;
    private double height;

    public ShapeConstHi() {
        width = height = 0.0;
    }

    public ShapeConstHi(double w, double h) {
        width = w;
        height = h;
    }

    public ShapeConstHi(ShapeConstHi ob) {
        width = ob.width;
        height = ob.height;
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

    public void ssetHeight(double h) {
        height = h;
    }
}

class TriangleConstHi extends ShapeConstHi {
    private String style;
    
    public TriangleConstHi() {
        super();
        style = "none";
    }

    public TriangleConstHi(String s, double w, double h) {
        super(w, h);
        style =s;
    }

    public TriangleConstHi(TriangleConstHi ob) {
        super(ob);
        style = ob.style;
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public String getStyle() {
        return style;
    }
}

class ConstructorHiarch {
    public static void main(String args[]) {
        TriangleConstHi t1 = new TriangleConstHi("outlined", 6, 8);
        TriangleConstHi t2 = new TriangleConstHi(t1);
        System.out.println(t2.area() + " "  + t2.getStyle());
    }
}
