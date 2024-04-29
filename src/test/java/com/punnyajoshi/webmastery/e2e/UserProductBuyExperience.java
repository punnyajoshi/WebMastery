package com.punnyajoshi.webmastery.e2e;

import com.punnyajoshi.webmastery.data.client.OrderDataClient;
import com.punnyajoshi.webmastery.models.Order;
import org.testng.annotations.Test;

public class UserProductBuyExperience {
//    @Test
//    public void verifyUserIsAbleToBuyProduct(){
//        ProductDataClient productDataClient=new ProductDataClient();
//        Product skiesProduct = productDataClient.getSkiesProduct();
//        System.out.println(skiesProduct);
//
//    }

    @Test
    public void orderDataClient(){
        OrderDataClient orderDataClient=new OrderDataClient();
        Order singleOrder = orderDataClient.getSingleOrder();
        System.out.println(singleOrder);
    }
}
