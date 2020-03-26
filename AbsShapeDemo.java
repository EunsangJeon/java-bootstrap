abstract class AbsShape {
   private double width;
   private double height;
   private String name;

   public AbsShape() {
       width = height = 0.0;
       name = "none";
   }

   public AbsShape(double w, double h, String n) {
       width = w;
       height = h;
       name = n;
   }

   public AbsShape(AbsShape ob) {
       width = ob.width;
       height = ob.height;
       name = ob.name;
   }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setWidth(double w) { width = w; }
    public void setHeight(double h) { height = h; }
    public String getName() { return name; } 

    abstract double area();
}

class AbsTriangle extends AbsShape {
    private String style;

    public AbsTriangle() {
        super();
        style = "none";
    }

    public AbsTriangle(double w, double h, String s) {
        super(w, h, "triangle");
        style = s;
    }

    public AbsTriangle(AbsTriangle ob) {
        super(ob);
        style = ob.style;
    }

    public double area() {
        return getHeight() * getWidth() / 2;
    }
}

class AbsShapeDemo {
    public static void main(String args[]) {
        AbsShape sh = new AbsTriangle(10, 20, "FILLED");
        System.out.println(sh.area());
    }
}
