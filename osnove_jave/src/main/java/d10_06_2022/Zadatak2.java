package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak2 {

// 2.Zadatak
//●	Napisati program koji ucitava stranicu https://geodata.solutions/
//●	Bira proizvoljan Country, State i City
//●	Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//●	I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//●	Izabrerit Country, State i City tako da imate podatke da selektujete!


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        Random random = new Random();

        String url = "https://geodata.solutions/";
        driver.get(url);

        Select country = new Select(driver.findElement(By.id("countryId")));
        List<WebElement> countries = country.getOptions();
        int indexCountry = random.nextInt(countries.size());
        country.selectByIndex(indexCountry);
        Thread.sleep(500);
        Select state = new Select(driver.findElement(By.id("stateId")));
        List<WebElement> states = state.getOptions();
        int indexState = random.nextInt(states.size());
        state.selectByIndex(indexState);
        Thread.sleep(500);
        Select city = new Select(driver.findElement(By.id("cityId")));
        List<WebElement> cities = city.getOptions();
        int indexCity = random.nextInt(cities.size());
        city.selectByIndex(indexCity);
        Thread.sleep(500);

        driver.quit();

    }
}
