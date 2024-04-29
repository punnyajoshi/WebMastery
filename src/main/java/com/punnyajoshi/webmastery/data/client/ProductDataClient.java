package com.punnyajoshi.webmastery.data.client;

import com.punnyajoshi.webmastery.data.client.DataClient;
import com.punnyajoshi.webmastery.models.Product;

public class ProductDataClient extends DataClient {
    public Product getSkiesProduct(){
        String filepath=getFilePath("products.json");
        return (Product) dataMapper.map(filepath,"skiesProduct", Product.class);
    }
}
