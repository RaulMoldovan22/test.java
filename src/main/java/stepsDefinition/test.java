package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

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

    @Then("Click button Autentificare")
    public void click_auth() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div[2]/div/div[3]/ul/li[1]/a")).click();
        sleep(2000);
    }

    @Then("Puenm Email valid: {string}")
    public void email(String email) throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"InputEmail\"]")).sendKeys(email);
        sleep(1000);
    }

    @Then("Punem Parola valida")
    public void pass() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"InputPsw\"]")).sendKeys("Azimut1234");
        sleep(1000);
    }

    @Then("Click Accesare cont")
    public void click_cont() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"vue-container\"]/div/div/div/div/div/div[1]/div/div/form/div[4]/button")).click();
        sleep(1000);
    }

    @Then("Alegem limba romana")
    public void lanuage() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"lang-modal\"]/div/div/div[2]/ul/li[3]/img")).click();
        sleep(1000);
    }


    //-------------------------SHOP------------------------

    @Then("Intram in tabul - Pentru fani")
    public void choose_fan() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"navigation-menu\"]/li[3]/a")).click();
        sleep(700);
    }

    @Then("Alegem - Cluburi de fotbal")
    public void choose_cluburi() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"twig-container\"]/div[4]/div/ul/li[1]/a")).click();
        sleep(3000);
    }

    @Then("Alegem echipa - Inter Milano")
    public void choose_inter() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"twig-container\"]/div[4]/div/ul/li[11]/a")).click();
        sleep(3000);
    }

    @Then("Alegem tricoul de joc a celor de la Inter")
    public void pick_inter_shirt() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@alt='Tricou Nike Inter Milan 22/23 Home Stadium']")).click();
        sleep(3000);
    }

    @Then("Selectam marimea S")
    public void size_s() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"twig-container\"]/div[2]/div[1]/div[1]/div[2]/div/div/div/div[4]/div/div[1]/ul/li[1]/button")).click();
        sleep(7000);
    }

    @Then("O adaugam in cos")
    public void put_on() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"twig-container\"]/div[2]/div[1]/div[1]/div[2]/div/div/div/div[6]/div[2]/div[2]")).click();
        sleep(7000);
    }

    @Then("Inchidem tabul afisat")
    public void close_window() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@aria-label='Close']")).click();
        sleep(3000);
    }

    @Then("Vizualizam cosul de cumparaturi")
    public void view_basket() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div[2]/div/div[3]/ul/li[3]/a")).click();
        sleep(3000);
    }

    @Then("Mergem la cosul de cumparaturi, pentu a face comanda")
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

    //-------------------------Search + Favorit------------------------
    @Then("Cauta: {string}")
    public void cauta(String cauta) throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div[2]/div/div[3]/div/div/div/div/input")).sendKeys(cauta);
        sleep(3000);
    }
    @Then("Click Lupa cauta")
    public void go() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div[2]/div/div[3]/div/div/div/div/a/i")).click();
        sleep(3000);
    }
    @Then("Click pentru a adauga la produse dorite")
    public void adauga_favorite() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"twig-container\"]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/a/div[1]/div[2]/div[1]/div/span/i")).click();
        sleep(3000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"__BVID__593___BV_modal_footer_\"]/button[2]")).click();
        sleep(3000);
    }
    @Then("Adaugam o noua lista de produse dorite: {string}")
    public void lista_implicita(String lista) throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@placeholder='Listă de produse dorite nouă...']")).sendKeys(lista);
        sleep(6000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"__BVID__595___BV_modal_body_\"]/button")).click();
        sleep(5000);
    }
    @Then("Selectam lista adaugata anterior")
    public void select_lista_adaugata() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"__BVID__595___BV_modal_body_\"]/div[2]/div")).click();
        sleep(3000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"__BVID__595___BV_modal_header_\"]/button")).click();
        sleep(3000);
    }
    @Then("Vizualizare lista creata")
    public void vizualizare_lista_creata() throws InterruptedException {
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[3]/header/div[2]/div/div[3]/ul/li[2]/a")).click();
        sleep(3000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"vue-container\"]/div/div[2]/div/div[1]/a")).click();
        sleep(3000);
        WebDriverInitialize.getDriver().findElement(By.xpath("//*[@id=\"vue-container\"]/div/div[3]/div/div/div/div[3]/div/div/div/a")).click();
        sleep(3000);
    }

}


