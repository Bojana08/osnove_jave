package d14_06_2022;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import sun.reflect.misc.FieldUtil;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BootstrapTableTests {

//    1.Zadatak
//    Kreirati BootstrapTableTests klasu koja ima:
//    Base url: https://s.bootsnipp.com
//    Test #1: Edit Row
//    Podaci:
//●	First Name: ime polaznika
//●	Last Name: prezime polaznika
//●	Middle Name: srednje ime polanzika
//    Koraci:
//●	Ucitati stranu /iframe/K5yrx
//●	Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
//●	Klik na Edit dugme prvog reda
//●	Sacekati da dijalog za Editovanje bude vidljiv
//●	Popuniti formu podacima.
//○	Bice potrebno da pre unosa tekst pobrisete tekst koji vec postoji, za to se koristi metoda clear. Koristan link
//●	Klik na Update dugme
//●	Sacekati da dijalog za Editovanje postane nevidljiv
//●	Verifikovati da se u First Name celiji prvog reda tabele javlja uneto ime
//●	Verifikovati da se u Last Name celiji prvog reda tabele javlja uneto prezime
//●	Verifikovati da se u Middle Name celiji prvog reda tabele javlja uneto srednje ime
//●	Za sve validacije ispisati odgovarajuce poruke u slucaju greske
//
//    Test #2: Delete Row
//    Podaci:
//●	First Name: ime polaznika
//●	Last Name: prezime polaznika
//●	Middle Name: srednje ime polanzika
//    Koraci:
//●	Ucitati stranu /iframe/K5yrx
//●	Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
//●	Klik na Delete dugme prvog reda
//●	Sacekati da dijalog za brisanje bude vidljiv
//●	Klik na Delete dugme iz dijaloga
//●	Sacekati da dijalog za Editovanje postane nevidljiv
//●	Verifikovati da je broj redova u tabeli za jedan manji
//●	Za sve validacije ispisati odgovarajuce poruke u slucaju greske
//
//    Test #3: Take a Screenshot
//    Koraci:
//●	Ucitati stranu  /iframe/K5yrx
//●	Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
//●	Kreirati screenshot stranice. Koristan link https://www.guru99.com/take-screenshot-selenium-webdriver.html
//●	Fajl cuvajte na putanji gde su vam bile slike od proslog domaceg. Na putanji: src/main/resources/nazivslike.png


    private WebDriver driver;
    private String baseUrl = "https://s.bootsnipp.com";
    private File getSreenShotMethodImageFile =
            new File ("src/main/resources/nazivslike.png");

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @BeforeMethod
    public void beforeMethod() {
        this.driver.get(baseUrl);
    }

    @Test (priority = 1)
    public void editRow() {
        String firstName = "Petar";
        String lastName = "Petrovic";
        String middleName = "Jovan";
        this.driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertTrue(
                this.driver.getTitle().equals("Table with Edit and Update Data - Bootsnipp.com"),
                "[ERROR] - Page title is not 'Table with Edit and Update Data - Bootsnipp.com'.");
        this.driver.findElement(By.xpath("//tr[@id='d1']/td[5]/button")).click();
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='edit']/div[2]")));
        this.driver.findElement(By.id("fn")).clear();
        this.driver.findElement(By.id("ln")).clear();
        this.driver.findElement(By.id("mn")).clear();
        this.driver.findElement(By.id("fn")).sendKeys(firstName);
        this.driver.findElement(By.id("ln")).sendKeys(lastName);
        this.driver.findElement(By.id("mn")).sendKeys(middleName);
        this.driver.findElement(By.id("up")).click();
        Assert.assertEquals(
                this.driver.findElement(By.id("f1")).getText(),
                firstName,
                "[ERROR] - First Name cell is not updated."
        );
        Assert.assertEquals(
                this.driver.findElement(By.id("l1")).getText(),
                lastName,
                "[ERROR] - Last Name cell is not updated."
        );
        Assert.assertEquals(
                this.driver.findElement(By.id("m1")).getText(),
                middleName,
                "Middle Name cell is not updated."
        );
    }

    @Test (priority = 2)
    public void deleteRow() {
        String firstName = "Nikola";
        String lastName = "Nikolic";
        String middleName = "Marko";
        this.driver.navigate().to(baseUrl + "/iframe/K5yrx");
        Assert.assertTrue(
                this.driver.getTitle().equals("Table with Edit and Update Data - Bootsnipp.com"),
                "[ERROR] - Page title is not 'Table with Edit and Update Data - Bootsnipp.com'.");
        List<WebElement> elements = this.driver.findElements(By.xpath("//tbody/tr"));
        this.driver.findElement(By.xpath("//tr[@id='d1']/td[6]/button")).click();
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='delete']/div[2]")));
        this.driver.findElement(By.id("del")).click();
        List<WebElement> elements1 = this.driver.findElements(By.xpath("//tbody/tr/td[last()]"));
        Assert.assertEquals(elements1.size(),
                elements.size() - 1,
                "[ERROR] - Number of rows is same as before deleting.");
    }

    @Test (priority = 3)
    public void takeAScreenshot() throws IOException {
        this.driver.navigate().to(baseUrl + "/iframe/K5yrx");
        Assert.assertTrue(
                this.driver.getTitle().equals("Table with Edit and Update Data - Bootsnipp.com"),
                "[ERROR] - Page title is not 'Table with Edit and Update Data - Bootsnipp.com'.");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, getSreenShotMethodImageFile);
    }

    @AfterMethod
    public void afterMethod() {

    }

    @AfterClass
    public void afterClass() {
        this.driver.quit();
    }
}


