import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

    public class stepDefinitionLogin {

        WebDriver driver = new ChromeDriver();


        @Given("User navigates to login page")
        public void user_navigates_to_login_page() {
            driver.get("https://the-internet.herokuapp.com/login");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        }

        @When("User enters a valid username and password")
        public void user_enters_a_valid_username_and_password() {
            driver.findElement(By.id("username")).sendKeys("tomsmith");
            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
        }

        @Then("User should be successfully logged in redirected to Secure Area page")
        public void user_should_be_successfully_logged_in_redirected_to_secure_area_page() {

            Boolean securePage = driver.findElement(By.id("flash")).isDisplayed();

            Assert.assertTrue(securePage);
        }


    }
