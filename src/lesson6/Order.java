package lesson6;

import java.util.Date;

public class Order {
    //1.fields
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    //2 constructors
    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {
    }

    //3 methods
    public void confirmOrder() {
        if (isConfirmed) {//это длинная конструкц. if, else     //вот более короткий пример: if (!isConfirmed)
        } else {                                                                            //isConfirmed = true;
            isConfirmed = true;                                                           //dateConfirmed = new Date();
            dateConfirmed = new Date();
        }
    }


    public boolean checkPrice() {
        boolean result = false;
        if (price > 1000) {         // return price > 1000 ? true : false ; мой пример неправ.
            result = true;
        }
        return result;
    }

    public boolean isValidType() {
        String Buy = null;
        String Sale = null;
        if (type == Buy || type == Sale) {
            return true;
        }
        return false;
    }
}
