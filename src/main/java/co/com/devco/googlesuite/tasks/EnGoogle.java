package co.com.devco.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class EnGoogle implements Task {

    private String textoABuscar;

    public EnGoogle(String textoABuscar){
        this.textoABuscar = textoABuscar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        BrowseTheWeb.as(actor).getDriver().switchTo().window(tabs.get(2));
        actor.attemptsTo(
                Abrir.laPaginaDe(SuiteUrl.GOOGLE)
        );
    }
}
