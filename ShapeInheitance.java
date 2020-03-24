class TwoShape {
    public double width;
    public double height;

    public void ShowDim() {
        System.out.println(width + " " + height);
    }
}

class Triangle extends TwoShape {
    public String style;

    public double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle style: " + style);
    }
}

class ShapeInheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.width = 4.0;
        t1.height = 11.0;

        System.out.println(t1.area());
    }
}