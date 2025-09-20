package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("que estou na página de login")
    public void abrirPaginaLogin() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("eu entro com usuário {string} e senha {string}")
    public void preencherLogin(String user, String senha) {
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(senha);
        driver.findElement(By.id("login-button")).click();
    }

    @Then("devo ver a página de produtos")
    public void validarLogin() {
        boolean produtos = driver.findElement(By.className("title")).isDisplayed();
        if (!produtos) {
            throw new AssertionError("Login falhou!");
        }
        driver.quit();
    }
}
