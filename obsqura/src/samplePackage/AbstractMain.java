package samplePackage;

// Parent abstract class
abstract class Payment {
    
    void enterAmount() {
        System.out.println("Enter Amount");
    }

    abstract void pay();
}

// Child class 1
class GooglePay extends Payment {
    void pay() {
        System.out.println("Processing payment via Google Pay");
    }
}

// Child class 2
class PhonePay extends Payment {
    void pay() {
        System.out.println("Processing payment via PhonePe");
    }
}

// Main class
public class AbstractMain {
    public static void main(String[] args) {
        
        Payment gp = new GooglePay();
        gp.enterAmount();
        gp.pay();

        System.out.println("-----");

        Payment pp = new PhonePay();
        pp.enterAmount();
        pp.pay();
    }
}