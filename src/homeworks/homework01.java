package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class homework01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ali Osman\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramaButonu= driver.findElement(By.id("nav-search-submit-button"));
        Thread.sleep(2000);

        aramaKutusu.sendKeys("city bike");
        aramaButonu.click();
        Thread.sleep(2000);
        WebElement sonucSayisi = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println("bulunan sonuc sayisi "+sonucSayisi.getText());
        Thread.sleep(2000);
        WebElement todaysdeals =driver.findElement(By.linkText("Today's Deals"));
        todaysdeals.click();


    }
}
