class Vehicle00 {
    int passengers;
    int fuelcap;
    int mpg;

    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }
}

class AddMeth {
    public static void main(String args[]){
        Vehicle00 minivan = new Vehicle00();
        Vehicle00 sportscar = new Vehicle00();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.range();
        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range();
    }
}
