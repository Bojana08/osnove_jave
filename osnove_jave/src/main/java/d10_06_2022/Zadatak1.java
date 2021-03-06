package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak1 {

//  1.Zadatak
//    Napisati program koji:
//    ●	Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//    ●	Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice
//    i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//    ●	POMOC: Brisite elemente odozdo.
//    ●	(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/Dq2X";
        driver.get(url);
        Thread.sleep(1000);

        List<WebElement> elements = driver.findElements(By.className("close"));

        for (int i = 0; i < elements.size(); i++) {
            driver
                    .findElement(By.xpath("//div[contains(@class, 'col-md-12')]/div[last()]/button[contains(@class, 'close')]"))
                    .click();
            List<WebElement> elements1 = driver.findElements(By.className("close"));
            if (elements1.size() == elements.size() - 1 - i) {
                System.out.println("Element is deleted.");
            } else {
                System.out.println("Element is not deleted.");
            }
            Thread.sleep(1000);
        }
        driver.quit();

    }

}


