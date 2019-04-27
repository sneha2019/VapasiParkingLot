public class Car extends Vehicle {

    public String Brand;


    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setCar(String t, int n, String c, String wt) {
        type = t;
        number = n;
        color = c;
        walletType = wt;
    }

    public void setWallet(float bal){
        walletBalance = bal;
    }

    public void printWallet(){
        System.out.println( "Car number =" + number + " "+ walletType + "Wallet" + " Balance= "+walletBalance);
    }

    void print() {
            System.out.println("Is car parked ?.." + parked);
        }

    void printCar(){
        System.out.println("Car type is " + type + ". Number = " + number + " Color= " + color);
    }
}
