import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinitionInvalidLogin {

    WebDriver driver = new ChromeDriver();

    String msg = "Your username is invalid!";

    @Given("User navigates to login net page")
    public void user_navigates_to_login_net_page() {
        driver.get("https://the-internet.herokuapp.com/login");

    }

    @When("User enters a invalid username and password")
    public void user_enters_a_invalid_username_and_password() {
        driver.findElement(By.id("username")).sendKeys("wrongusername");
        driver.findElement(By.id("password")).sendKeys("wrongpassword");
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
    }

    @Then("User get an error message Your username is invalid should be displayed")
    public void user_get_an_error_message_your_username_is_invalid_should_be_displayed() {
        WebElement invalidusername = driver.findElement(By.id("flash"));
        String actualMsg = invalidusername.getText();
        Assert.assertTrue(actualMsg.contains(msg));
    }
}
