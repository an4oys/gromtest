package lesson8.phones;

public class IPhone extends Phone{
    int price;
    double weight;
    String countryProduced;

    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
        super(price, weight, countryProduced);
        //this.price = price;
        // this.weight = weight;
        //this.countryProduced = countryProduced;
        System.out.println("IPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;

    }

    // void orderPhone() {
    //some logic


    void deleteIphoneFromDb() {
        System.out.println("deleteIPhoneFromDb invoked...");
    }
}
