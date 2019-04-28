public class Test {

    public static void main(String[] args) {

        Parking p = new Parking(2);

        Car car1 = new Car();
        Car car2 = new Car();
        Suv suv1 = new Suv();
        Suv suv2 = new Suv();

        car1.setCar("Sedan",1111, "Blue", "Google");
        car2.setCar("Hatch",2222,"Red","Amazon");
        suv1.setSuv("Mahindra",3333,"Black","Amazon");
        suv2.setSuv("Ford",4444,"White","Google");

        p.park(car1.number);
        p.park(car2.number);
        p.park(suv1.number);
        p.park(suv2.number); //no space
        p.printSlots();

        car1.walletBalance = 600;
        p.unPark(car1);
        p.printSlots();

        /*System.out.println("Car " + car3.number + " is parked -->" + car3.parked);
        p.park(car3);
        System.out.println("Car " + car3.number + " is parked -->" + car3.parked);
        p.printSlots();

        //p.park(c2.number);
        //p.printSlots();*/


    }
}
