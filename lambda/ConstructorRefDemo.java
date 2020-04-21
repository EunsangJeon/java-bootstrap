package lambda;

interface MyFuncCons {
    MyClassCons func(String s);
}

class MyClassCons {
    private String str;

    MyClassCons(String s) {
        str = s;
    }

    MyClassCons() {
        str = "";
    }

    String getStr() {
        return str;
    }
}

public class ConstructorRefDemo {
    public static void main(String args[]) {
        MyFuncCons myClassConstructor = MyClassCons::new;
        MyClassCons mc = myClassConstructor.func("Testing");
        System.out.println("str in mc is " + mc.getStr( ));
    }
}