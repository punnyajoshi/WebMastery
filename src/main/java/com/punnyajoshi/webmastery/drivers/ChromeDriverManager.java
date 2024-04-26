package com.punnyajoshi.webmastery.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.punnyajoshi.webmastery.drivers.FeatureToggles.HEADLESS;
import static com.punnyajoshi.webmastery.drivers.FeatureToggles.RESPONSIVE;

public class ChromeDriverManager {

    public WebDriver create(){
        WebDriver driver;
        if(HEADLESS.isOff()){
            return new ChromeDriver(getResponsiveOptions());
        }
        if(RESPONSIVE.isOn()){
            return new ChromeDriver(getHeadlessOptions());
        }
        return new ChromeDriver(getHeadlessOptions());
    }

    private ChromeOptions getHeadlessOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("disable-gpu");
        chromeOptions.addArguments("--windows-size=1300,1000");


        return chromeOptions;


    }

    public ChromeOptions getResponsiveOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("deviceName=pixel7");
        return chromeOptions;
    }
}
