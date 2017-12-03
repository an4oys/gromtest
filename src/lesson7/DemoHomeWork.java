package lesson7;

import lesson6.Order;

import java.util.Date;

public class DemoHomeWork {
    Order createOrder() {
        return new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Bye");
    }

    Order createOrderAndCallMethods(){
        Order order = new Order(100, new Date(), true, new Date(), "Kyiv", "Ukraine", "SomeValue" );
        order.checkPrice();
        order.confirmOrder();
        order.isValidType();
        return order;
    }
}
