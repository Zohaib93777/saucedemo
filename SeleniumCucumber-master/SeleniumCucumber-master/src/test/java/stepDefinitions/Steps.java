package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Steps {

    WebDriver driver;

    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application(){
        System.out.println("Open Browser and Launch Application");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user"); //login Username
        driver.findElement(By.id("password")).sendKeys("secret_sauce"); //Password
        driver.findElement(By.id("login-button")).click(); // click on Login btn
        System.out.println("Provide Username and Password, click on Login button");
    }

    @Then("^Sort Products using filter$")
    public void sort_products_using_filter() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/span/select")).click(); //Clicking on Filter
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/span/select/option[4]")).click(); //Selecting Filters
        System.out.println("Product sorted and selected");

    }

    @Then("^Add To Cart 2 Products$")
    public void add_to_cart_2_products() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click(); //Add product to the cart
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click(); //Add product to the cart
        System.out.println("2 Products Added To The Cart");

    }

    @Then("^Remove 1 Product$")
    public void remove_1_product() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-2000)");  //scrolling page up
        driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click(); //removing product
        System.out.println("1 Product Removed");

    }

    @Then("^Click on Checkout$")
    public void click_on_checkout() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[3]/a")).click(); //clicking on Add to Cart
        Thread.sleep(3000);
        driver.findElement(By.id("checkout")).click();  //clicking on Checkout
        System.out.println("Checkout");
    }


    @Then("^Click on Menubar$")
    public void click_on_menubar() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("react-burger-menu-btn")).click();   //clicking on Menu-bar btn
        System.out.println("Menubar");
    }

    @Then("^Logout Application$")
    public void logout_application() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("logout_sidebar_link")).click(); //clicking on Logout
        System.out.println("Logout");
        driver.quit();

    }
}
