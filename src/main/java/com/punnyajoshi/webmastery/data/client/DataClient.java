package com.punnyajoshi.webmastery.data.client;

import com.punnyajoshi.webmastery.data.mappers.DataMapper;
import com.punnyajoshi.webmastery.data.mappers.JSONDataMapper;

import java.util.Objects;

public class DataClient {
    protected DataMapper dataMapper;
    public DataClient() {
        dataMapper = new JSONDataMapper();
    }

    protected String getFilePath(String relativePath) {
        return Objects.requireNonNull(this.getClass()
                        .getClassLoader()
                        .getResource(String.format("data_sets/%s",relativePath)))
                .getPath();
    }
}
