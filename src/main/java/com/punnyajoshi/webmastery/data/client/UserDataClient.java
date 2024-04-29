package com.punnyajoshi.webmastery.data.client;

import com.punnyajoshi.webmastery.data.client.DataClient;
import com.punnyajoshi.webmastery.models.User;

public class UserDataClient extends DataClient {

    public User getBlockedUserForSpam(){
        String filepath=getFilePath("users/blockedUsers.json");
        return (User) dataMapper.map(filepath,"userBlockedSpam", User.class);
    }

}
