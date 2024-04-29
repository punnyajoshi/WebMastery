package com.punnyajoshi.webmastery.data;

import org.junit.jupiter.api.Order;

public class OrderDataClient extends DataClient{
    public Order getSingleOrder(){
        String filepath=getFilePath("orders/validOrders.json");
        return (Order) dataMapper.map(filepath,"userWithOneOrder",Order.class);
    }
}
