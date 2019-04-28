    import java.util.ArrayList;

    public class Parking {
        public int capacity;
        public float parkFee = 100 ;

        ArrayList slots = new ArrayList<Integer>(capacity);

        public void park(int cn){
            if(slots.size() < capacity){
                slots.add(cn);
            }else {
                System.out.println("Parking is full");
            }
        }

        public void park(Car c){
            if(slots.size() < capacity){
                slots.add(c.number);
                c.parked = true;
            }else {
                System.out.println("Parking is full");
            }
        }

        public void payment(Car c) {
            System.out.println(c.walletType + " Wallet " + "has balance = " + c.walletBalance + " before paying");

            if(c.walletType == "Google" && c.walletBalance > 500){
                c.cashback = (float) (c.cashback + 0.2 *parkFee);
                System.out.println("Eligible for  20% cashback to Google wallet after payment");
            }

            if(c.walletType == "Amazon" && c.walletBalance > 1000){
                c.cashback = (float) (c.cashback + 0.2*parkFee);
                System.out.println("Eligible 20% cashback to Amazon wallet after payment");
            }


            if (c.walletBalance > 100) {
                c.walletBalance = c.walletBalance - 100;

                c.walletBalance = c.walletBalance + c.cashback; //add cashback to wallet
                c.cashback = 0; // set cashback to 0
                System.out.println("New wallet balance = " + c.walletBalance);
            } else {
                System.out.println("Insufficent balance in the wallet");
                //return -1;
            }

            //return 1;
        }

        public void unPark(Car c){
            int parkedSlot;
            parkedSlot = slots.indexOf(c.number);

            if( parkedSlot > -1){
                slots.remove(parkedSlot);
                payment(c);
            }else{
                System.out.println("Car not found in parking");
            }
        }

        public void printSlots(){
            System.out.println("Cars currently parked are -->" + slots);
            System.out.println("Size = " + slots.size());
        }

        public Parking(int i) {
            this.capacity = i;
        }
    }
