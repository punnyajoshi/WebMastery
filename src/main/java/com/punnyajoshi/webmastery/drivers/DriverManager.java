package com.punnyajoshi.webmastery.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.checkerframework.checker.units.qual.C;


import static org.openqa.selenium.remote.Browser.*;

public class DriverManager {

    private String browser = System.getProperty("browser","chrome");

    public WebDriver create(BrowserType type){
        switch (type){
            case FIREFOX:
                return new FirefoxDriver();

            case EDGE:
                return new EdgeDriver();

            case CHROME:
            default:
                return new ChromeDriver();
        }
    }

    public WebDriver create(){
        BrowserType type = BrowserType.valueOf(browser.trim().toUpperCase());
        return create(type);
    }
}
