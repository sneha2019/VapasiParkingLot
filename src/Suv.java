public class Suv extends Vehicle {

    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSuv (String t, int n, String c, String wt) {
        type = t;
        number = n;
        color = c;
        walletType = wt;
    }

    public void setWallet (){
        System.out.println( "Suv number =" + number + " "+ walletType + "Wallet" + " Balance= "+walletBalance);
    }

    void print() {
        System.out.println("Is car parked ?.." + parked);
    }

    void printSuv(){
        System.out.println("Car type is " + type + ". Number = " + number + " Color= " + color);
    }

}

