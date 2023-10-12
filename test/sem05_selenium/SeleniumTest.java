package sem05_selenium;

// Seleniun импортировать нужно как поверхностно так и внутреннюю папку lib
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    @Test
    void testOpenSite() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        WebElement webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("Selenium");
        webElement.submit();
        List<WebElement> result = webDriver.findElements(By.cssSelector("div"));
        boolean found = false;
        for (WebElement element : result) {
            if (element.getText().contains("selenium.dev")) {
                found = true;
            }
        }
        assertTrue(found);
        webDriver.quit();
        // 10 сек ждём
//        Thread.sleep(10000);
    }
}
