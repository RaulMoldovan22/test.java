package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DefaultDataTableEntryTransformer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static java.lang.Thread.sleep;

public class test {


    //-------------------------LOGIN PAGE------------------------
    @Given("Open Rgol page")
    public void open_site() throws InterruptedException {
        WebDriverInitialize.startBrowser("https://www.r-gol.com/ro");
        sleep(2000);
    }

    @Then("Accept Cookie")
    public void accept() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.id("onetrust-accept-btn-handler")).click();
        sleep(200);
    }
    @Then("Click Man")
    public void click_auth() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div[2]/div/div[3]/ul/li[1]/a")).click();
        sleep(2000);
    }
   @Then("Put Email")
   public void email() throws InterruptedException {
       WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"InputEmail\"]")).sendKeys("raul_moldovan22@yahoo.com");
        sleep(1000);
    }
    @Then("Put Pass")
    public void pass() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"InputPsw\"]")).sendKeys("Azimut1234");
        sleep(1000);
    }
    @Then("Click")
    public void click() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"vue-container\"]/div/div/div/div/div/div[1]/div/div/form/div[4]/button")).click();
        sleep(1000);
    }
    @Then("Choose language")
    public void lanuage() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"lang-modal\"]/div/div/div[2]/ul/li[3]/img")).click();
        sleep(1000);
    }


    //-------------------------SHOP------------------------

    @Then("Choose Fan")
    public void choose_fan() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"navigation-menu\"]/li[3]/a")).click();
        sleep(700);
    }

    @Then("Choose Cluburi")
    public void choose_cluburi() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"twig-container\"]/div[4]/div/ul/li[1]/a")).click();
        sleep(3000);
    }

    @Then("Choose Inter Milano")
    public void choose_inter() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"twig-container\"]/div[4]/div/ul/li[11]/a")).click();
        sleep(3000);
    }
    @Then("Pick Inter Shirt")
    public void pick_inter_shirt() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@alt='Tricou Nike Inter Milan 22/23 Home Stadium']")).click();
        sleep(3000);
    }

    @Then("Choose Size S")
    public void size_s() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"twig-container\"]/div[2]/div[1]/div[1]/div[2]/div/div/div/div[4]/div/div[1]/ul/li[1]/button")).click();
        sleep(7000);
    }
    @Then("Put on basket")
    public void put_on() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"twig-container\"]/div[2]/div[1]/div[1]/div[2]/div/div/div/div[6]/div[2]/div[2]")).click();
        sleep(7000);
    }
    @Then("Close window")
    public void close_window() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@aria-label='Close']")).click();
        sleep(3000);
    }

    @Then("View basket")
    public void view_basket() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div[2]/div/div[3]/ul/li[3]/a")).click();
        sleep(3000);
    }
    @Then("Go to basket")
    public void go_basket() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@class='mini-basket__buttons d-flex justify-content-center']")).click();
        sleep(3000);
    }

    //-------------------------LOG OUT------------------------
    @Then("Logout")
    public void go_logout() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"vue-container\"]/div/div[1]/div/div/div/div[3]/div/ul/li[9]/a")).click();
        sleep(3000);
    }

}

