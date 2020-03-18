class Vehicle01 {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap;
    }
}

class RetMeth {
    public static void main(String args[]){
        Vehicle01 minivan = new Vehicle01();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        System.out.println(minivan.range());
    }
}
