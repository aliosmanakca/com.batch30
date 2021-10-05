package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ali Osman\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("suandaki url :"+ driver.getCurrentUrl());
        System.out.println("suandaki baslik :"+ driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

       // driver.close();//son sayfayi kapatir

        driver.quit();//tum sayfalari kapatir


    }
}
