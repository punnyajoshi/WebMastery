package com.punnyajoshi.webmastery.data.mappers;

public interface DataMapper<T> {
    //generics
    T map(String filename, String key, Class<T> tClass);
}
