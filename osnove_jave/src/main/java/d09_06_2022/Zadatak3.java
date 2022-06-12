package d09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak3 {

//3.Zadatak (Za vezbanje)
//    Napisati program koji matematicku formulu koju korisnik unese izvrsaav na stranici:
//            ●	Ucitati stranicu https://www.calculatorsoup.com/calculators/math/basic.php
//            ●	Korisnik unosi formulu, samo osnovne matematicke operacija, npr:
//            ○	1243+329=
//            ○	21912-4=
//            ○	12913÷4=
//            ●	U programu se formula unosi kao jedan string i potrebno je razbiti formulu na karaktere. Za to imate metodu https://www.geeksforgeeks.org/convert-a-string-to-a-list-of-characters-in-java/
//            ●	Zatim u odnosu na karakter uradite odredjenu logiku

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.calculatorsoup.com/calculators/math/basic.php";

        driver.navigate().to(url);

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the formula: ");
        String formula = s.next();

        for (int i = 0; i < formula.length(); i++) {
            char character = formula.charAt(i);
            String str = String.valueOf(character);
          driver
                  .findElement(By.id("display"))
                  .sendKeys(str);
          Thread.sleep(1000);
        }

        driver.quit();

    }
}
