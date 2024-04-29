package com.punnyajoshi.webmastery.data;

public class ProductDataClient extends DataClient{
    public Product getSkiesProduct(){
        String filepath=getFilePath("products.json");
        return (Product) dataMapper.map(filepath,"skiesProduct", Product.class);
    }
}
