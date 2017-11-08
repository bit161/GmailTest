/*package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyStepdefs {
    WebDriver driver = null;

    @Given("^open browser$")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("^go to page gmailcom$")
    public void goToPageGmailcom() {
        driver.get("https://gmail.com");
    }

    @When("^enter login$")
    public void enterLogin() {
        driver.findElement(By.name("identifier")).sendKeys("test2017selenium");
        driver.findElement(By.id("identifierNext")).click();
    }

    @Then("^enter Password$")
    public void enterPassword() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        driver.findElement(By.name("password")).sendKeys("seleniumtest2017");
        driver.findElement(By.id("passwordNext")).click();
    }

    @Given("^click button compose$")
    public void clickButtonCompose() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class = 'T-I J-J5-Ji T-I-KE L3']")));
        driver.findElement(By.cssSelector("div[class = 'T-I J-J5-Ji T-I-KE L3']")).click();
    }

    @When("^eneter the recipients$")
    public void eneterTheRecipients() {
        driver.findElement(By.name("to")).sendKeys("test2017selenium@gmail.com");
    }

    @And("^eneter the subject$")
    public void eneterTheSubject() {
        driver.findElement(By.name("subjectbox")).sendKeys("test2017selenium@gmail.com");
    }

}
*/