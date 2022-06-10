package p09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {

//2.Zadatak
//Napisati program koji:
//●	Maksimizuje prozor
//●	Ucitava stranicu https://demoqa.com/login
//●	Za username unosi itbootcamp. Xpath za trazivnje ovog elementa treba da bude preko id atributa.
//●	Za lozinku unosi ITBootcamp2021!  Xpath za trazenje ovog elementa treba da bude preko placeholder atributa.
//●	Klikce na dugme Login. Xpath ovog elementa treba da bude tako da se prvo dohvati form element i da se od njega
//    spusti do dugmeta
//●	Ceka 5sekundi
//●	Klikce na dugme Log out.Xpath ovog elementa treba da bude po tekstu elementa. Koristan link i podsetnik
//●	Zatvara pretrazivac


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/login";
        String userName = "itbootcamp";
        String password = "ITBootcamp2021!";

        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver
                .findElement(By.id("userName"))
                .sendKeys(userName);
        driver
                .findElement(By.xpath("//input[contains(@placeholder, 'Password')]"))
                .sendKeys(password);
        driver
                .findElement(By.xpath("//form[@id='userForm']/div[4]/div/button"))
                .click();
        Thread.sleep(5000);

        driver
                .findElement(By.xpath("//button[text()='Log out']"))
                .click();

        driver.quit();

    }
}
