public class Test {

    public static void main(String[] args) {


        Parking p = new Parking(2);

        Car v2 = new Car();
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();

        v2.setCar("Sedan",1122, "Blue", "Google");
        v2.printCar();

        c1.setCar("Hatch",1111,"Red","Amazon");
        c2.setCar("Sedan",2222,"Black","Amazon");
        c3.setCar("Sedan",3333,"White","Google");
        c4.setCar("Sedan",4444,"Blue","Google");

        p.park(v2.number);
        p.park(c1.number);
        p.park(c2.number); //no space
        p.printSlots();


        v2.walletBalance = 600;
        p.unPark(v2);
        p.printSlots();

        System.out.println("Car " + c2.number + " is parked -->" + c2.parked);
        p.park(c2);
        System.out.println("Car " + c2.number + " is parked -->" + c2.parked);
        p.printSlots();

        //p.park(c2.number);
        //p.printSlots();


    }
}
