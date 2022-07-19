package day6_RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class css_Locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //Browseri tam sayfa yapin
        driver.manage().window().fullscreen();

        //Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String title=driver.getTitle();
        if (title.contains("Spend less")){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAİLED");
        }

        //Gift Cards sekmesine basin

        //Birthday butonuna basin
        //Best Seller bolumunden ilk urunu tiklayin
        //Gift card details’den 25 $’i secin
        //Urun ucretinin 25$ oldugunu test edin
        //Sayfayi kapatin


    }
}
