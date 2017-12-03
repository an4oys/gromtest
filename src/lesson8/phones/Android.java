package lesson8.phones;

public class Android extends Phone{
    String androidVersion;
    int screenSize;

    String secretDeviseCode;

    public Android(int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviseCode) {
        //this.price = price;
        //this.weight = weight;
        //this.countryProduced = countryProduced;

        //this - это ссылка на обьект текущего класса
        //super - это ссылка на обьект родителя от которого мы наследуемся
        super(price, weight, countryProduced);
        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviseCode = secretDeviseCode;
    }

    void installNewAndroidVersion () {
        System.out.println("installNewAndroidVersion invoked...");
    }
}
