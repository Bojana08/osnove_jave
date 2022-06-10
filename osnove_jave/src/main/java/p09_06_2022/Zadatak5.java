package p09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {

//5.Zadatak
//Napisti program koji:
//●	Ucitava stranicu https://s.bootsnipp.com/iframe/z80en
//●	Hvata sve elemente prve kolone i stampa tekst svakog elementa. Kako da od nekog elementa procitamo tekst imate
//    na sledecem linku
//●	Ceka 1s
//●	Hvata sve element prvog reda i stampa tekst svakog elementa
//●	Ceka 5s
//●	Zatvara pretrazivac


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/z80en";
        driver.navigate().to(url);
        List<WebElement> prvaKolona = driver.findElements(By.xpath("//div[@id='lorem']/table/tbody/tr/td[1]"));

        for (int i = 0; i < prvaKolona.size(); i++) {
            System.out.println(prvaKolona.get(i).getText());
            Thread.sleep(1000);
        }

        List<WebElement> prviRed = driver.findElements(By.xpath("//tbody/tr[1]"));

        for (int i = 0; i < prviRed.size(); i++) {
            System.out.println(prviRed.get(i).getText());
            Thread.sleep(1000);
        }

        driver.quit();
    }
}
