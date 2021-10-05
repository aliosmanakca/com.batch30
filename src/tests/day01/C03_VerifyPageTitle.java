package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {
    public static void main(String[] args) {
        //Yeni bir Class olusturalim. (VerifyTitle)
        //Amazon ana sayfasina gidelim . https://www.amazon.com/
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ali Osman\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        //Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)
        String expectedTitle="amazon";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("ayni");
        }else{
            System.out.println("ayni değil actualTitle: "+driver.getTitle());
        }
    }
}
