package com.punnyajoshi.webmastery.data.client;

import com.punnyajoshi.webmastery.models.Order;

public class OrderDataClient extends DataClient {
    public Order getSingleOrder(){
        String filepath=getFilePath("data-sets/orders/validOrders.json");
        return (Order) dataMapper.map(filepath,"userWithOneOrder",Order.class);
    }
}
