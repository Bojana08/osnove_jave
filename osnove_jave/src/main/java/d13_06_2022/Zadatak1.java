package d13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak1 {

//    1.	Zadatak
//    Napisati program koji ima:
//    ●	Podesava:
//○	implicitno cekanje za trazenje elemenata od 10s
//○	implicitno cekanje za ucitavanje stranice od 10s
//○	eksplicitno cekanje podeseno na 10s
//●	Podaci:
//○	Potrebno je u projektu ukljuciti 4 slike.
//○	Imenovanje slika neka bude po pravilu pozicija_ime_prezime_polaznika.ekstenzija
//■	Npr: front_milan_jovanovic.jpg, left_milan_jovanovic.jpg …
//●	Koraci:
//○	Ucitava stranicu https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you
//○	Maksimizuje prozor
//○	Selektuje Image - Front klikom na tu karticu u dnu ekrana
//○	Klik na add photo iz levog navigacionog menia
//○	Upload slike. Upload preko File objekta koristeci getAbsolutePath
//○	Sacekati da broj prikazanih slika u donjem uglu navigacije bude za 1 veca
//○	Kliknuti na poslednje dodatu sliku kako bi bila izabrana za postavljenje
//○	Ceka da dijalog bude vidljiv
//○	Klik na Use One Side Only dugme
//○	Ponoviti proces za Left, Right i Back
//○	Zatim iz desnog gornjeg ugla izabrati random jedan od ponudjenih konfeta
//○	Kliknuti na Add To Cart dugme
//○	Verifikovati postojanje greske Oops! It looks like you`ve not added an text to this field, please add one before continuing.
//■	Xpath: //*[@action='error']
//○	Zatvorite pretrazivac


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String url = "https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you";
        driver.manage().window().maximize();
        driver.get(url);
        File image = new File("src/main/resources/front_bojana_radojkovic.jpg");
        File image1 = new File("src/main/resources/left_bojana_radojkovic.jpg");
        File image2 = new File("src/main/resources/back_bojana_radojkovic.jpg");
        File image3 = new File("src/main/resources/right_bojana_radojkovic.jpg");

        driver
                .findElement(By.xpath("//img[@alt='image 1']"))
                .click();
        driver
                .findElement(By.className("ddfNnQ"))
                .click();
        driver
                .findElement(By.xpath("//input[@type='file']"))
                .sendKeys(image.getAbsolutePath());
        List<WebElement> images = driver.findElements(By.className("haLJiC"));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("haLJiC"), images.size()));
        driver
                .findElement(By.xpath("//div[contains(@class,'sc-breuTD gmXCBU')]/img"))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dxCajp")));
        driver
                .findElement(By.xpath("//button[contains(text(),'Use One Side Only')]"))
                .click();
        Thread.sleep(1000);

        driver
                .findElement(By.xpath("//img[@alt='image 2']"))
                .click();
        driver
                .findElement(By.xpath("//div[contains(@class,'sc-gXmSlM ftncAy')]/div[1]/div[1]"))
                .click();
        driver
                .findElement(By.xpath("//input[@type='file']"))
                .sendKeys(image1.getAbsolutePath());
        images = driver.findElements(By.className("haLJiC"));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("haLJiC"), images.size()+1));
        driver
                .findElement(By.xpath("//div[contains(@class, 'kAzmBp')]/div[2]/div/img"))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dxCajp")));
        driver
                .findElement(By.xpath("//button[contains(text(),'Use One Side Only')]"))
                .click();
        Thread.sleep(1000);

        driver
                .findElement(By.xpath("//img[@alt='image 3']"))
                .click();
        driver
                .findElement(By.xpath("//div[contains(@class,'sc-gXmSlM GgCSa')]/div[1]/div[1]"))
                .click();
        driver
                .findElement(By.xpath("//input[@type='file']"))
                .sendKeys(image2.getAbsolutePath());
        images = driver.findElements(By.className("haLJiC"));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("haLJiC"), images.size()+1));
        driver
                .findElement(By.xpath("//div[contains(@class, 'kAzmBp')]/div[3]/div/img"))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dxCajp")));
        driver
                .findElement(By.xpath("//button[contains(text(),'Use One Side Only')]"))
                .click();
        Thread.sleep(1000);

        driver
                .findElement(By.xpath("//img[@alt='image 4']"))
                .click();
        driver
                .findElement(By.xpath("//div[contains(@class,'sc-gXmSlM qjPZb')]/div[1]/div[1]"))
                .click();
        driver
                .findElement(By.xpath("//input[@type='file']"))
                .sendKeys(image3.getAbsolutePath());
        images = driver.findElements(By.className("haLJiC"));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("haLJiC"), images.size()+1));
        driver
                .findElement(By.xpath("//div[contains(@class, 'kAzmBp')]/div[4]/div/img"))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dxCajp")));
        driver
                .findElement(By.xpath("//button[contains(text(),'Use One Side Only')]"))
                .click();
        Thread.sleep(1000);

        Random random = new Random();
        List<WebElement> confetti = driver.findElements(By.className("sc-jhzXDd"));
        int index = random.nextInt(confetti.size());
        String indexConfetti = String.valueOf(index);
        driver
                .findElement(By.name(indexConfetti))
                        .click();

        driver
                .findElement(By.className("jtbzvh"))
                .click();
        Thread.sleep(2000);

        try {
            driver.findElement(By.xpath("//*[@action='error']"));
            System.out.println("Error message exists.");
        } catch (Exception e) {
            System.out.println("Error message does not exist.");
        }

        driver.quit();

    }
}
