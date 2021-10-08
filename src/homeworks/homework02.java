package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class homework02 {
    public static void main(String[] args) throws InterruptedException {
        //amazona gidip java kelimesini aratin
        //kac sonuc geldigini ve gelen sonuclardan 4. ve 7. nin isimlerini yazdirin
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ali Osman\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchbox.sendKeys("java");
        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchButton.click();

        //1. Yontem
        /*List<WebElement> liste = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        System.out.println("4. urun: "+ liste.get(3).getText()+" 7. urun: "+ liste.get(6).getText());*/

        //2.Yontem
        WebElement urundort= driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[4]"));
        WebElement urunyedi= driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[7]"));
        System.out.println("4. urun: "+ urundort.getText()+" 7. urun: "+ urunyedi.getText());



    }
}
