package com.punnyajoshi.webmastery.drivers;

public enum FeatureToggles {
    HEADLESS(Boolean.parseBoolean(System.getProperty("headless","false"))),

    RESPONSIVE(Boolean.parseBoolean(System.getProperty("rsponsive","false"))),
    LOGGER(Boolean.parseBoolean(System.getProperty("headless","false")));



    private final boolean state;

    FeatureToggles(boolean state){
        this.state = state;
    }

    public Boolean isOn(){
        return state;
    }

    public Boolean isOff(){
        return !state;
    }
}
