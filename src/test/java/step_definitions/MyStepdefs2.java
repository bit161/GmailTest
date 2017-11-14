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
        driver.findElement(By.name("identifier")).sendKeys("test2017selenium");//enter login
        driver.findElement(By.id("identifierNext")).click();// btn next
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        driver.findElement(By.name("password")).sendKeys("seleniumtest2017"); //enter password
        driver.findElement(By.id("passwordNext")).click(); // btn next
    }

    @When("^click button compose$")
    public void clickButtonCompose() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class = 'T-I J-J5-Ji T-I-KE L3']")));
        driver.findElement(By.cssSelector("div[class = 'T-I J-J5-Ji T-I-KE L3']")).click(); //btn compose
    }

    @And("^eneter the recipients$")
    public void eneterTheRecipients() {
        driver.findElement(By.name("to")).sendKeys("test2017selenium@gmail.com");
    }

    @And("^enter the subject using the virtual keyboard$")
    public void enterTheSubjectUsingTheVirtualKeyboard() {

        driver.findElement(By.cssSelector("span[class = 'd-Na-J3 d-Na-hFsbo d-Na-JX-ax3'")).click();// select input tool
        driver.findElement(By.cssSelector("span[class = 'd-Na-N-M7-awE'")).click(); // use english virtual keyboard
        driver.findElement(By.name("subjectbox")).sendKeys();
        driver.findElement(By.cssSelector("#K72")).click();//h
        driver.findElement(By.cssSelector("#K73")).click();//i
        driver.findElement(By.cssSelector("div[class = 'RK-QJ-Jk RK-Qq-Mq'")).click();//close virtual keyboard
    }

    @And("^click button send$")
    public void clickButtonSend() {
        driver.findElement(By.cssSelector("div[class = 'T-I J-J5-Ji aoO T-I-atl L3']")).click();

    }
    @Then("^browser close$")
    public void browserClose() throws InterruptedException{
        Thread.sleep(10000);
        driver.quit();
    }


}
