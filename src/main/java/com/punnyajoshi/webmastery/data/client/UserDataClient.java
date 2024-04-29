package com.punnyajoshi.webmastery.data;

import com.punnyajoshi.webmastery.models.User;

public class UserDataClient extends DataClient{

    public User getBlockedUserForSpam(){
        String filepath=getFilePath("users/blockedUsers.json");
        return (User) dataMapper.map(filepath,"userBlockedSpam", User.class);
    }

}
