package br.com.srbarriga.utils.commons;


import br.com.srbarriga.utils.configuration.WebApplication;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @since 2020-02-11
 */
public class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;
    protected static WebDriverWait shortWait;
    protected static boolean initialized;


    /**
     * Inicializa o {@code WebDriver} e o {@code WebDriverWait}
     */
    protected void initializeWebApplication(WebApplication webApplication) {
        webDriver = webApplication.getDriver();
        webDriver.manage().window().fullscreen();
        wait = new WebDriverWait(webDriver, Duration.ofMinutes(1));
    }
    /**
     * fecha o driver web
     */
    protected static void closeWeb() {
        webDriver.quit();
    }

    /**
     * tira prints
     *
     * @param driver
     */
    private String takeScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }
}
