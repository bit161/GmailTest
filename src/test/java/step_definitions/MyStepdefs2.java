package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyStepdefs2 {
    WebDriver driver = null;

    @Given("^open gmail$")
    public void openGmail() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://gmail.com");
        driver.findElement(By.name("identifier")).sendKeys("test2017selenium");
        driver.findElement(By.id("identifierNext")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        driver.findElement(By.name("password")).sendKeys("seleniumtest2017");
        driver.findElement(By.id("passwordNext")).click();
    }

    @When("^click button compose$")
    public void clickButtonCompose() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class = 'T-I J-J5-Ji T-I-KE L3']")));
        driver.findElement(By.cssSelector("div[class = 'T-I J-J5-Ji T-I-KE L3']")).click();
    }

    @And("^eneter the recipients$")
    public void eneterTheRecipients() {
        driver.findElement(By.name("to")).sendKeys("test2017selenium@gmail.com");
    }

    @And("^enter the subject using the virtual keyboard$")// virtual keyboard is not used
    public void enterTheSubjectUsingTheVirtualKeyboard() {
        driver.findElement(By.name("subjectbox")).sendKeys("Hi");
    }

    @And("^click button send$")
    public void clickButtonSend() {
        driver.findElement(By.id(":7h")).click();

    }
    @Then("^browser close$")
    public void browserClose() throws InterruptedException{
        Thread.sleep(10000);
        driver.quit();
    }


}
