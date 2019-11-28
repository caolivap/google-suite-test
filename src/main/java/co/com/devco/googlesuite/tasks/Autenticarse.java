package co.com.devco.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import java.util.ArrayList;

import static co.com.devco.googlesuite.userinterfaces.LoginGmailPage.INPUT_PASSWORD;
import static co.com.devco.googlesuite.userinterfaces.LoginGmailPage.INPUT_USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Autenticarse implements Task {

    private String usuario;
    private String contrasenia;

    public Autenticarse(String usuario, String contrasenia){
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    @Step("{0} se autentica con su usuario y contrasenia")
    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        BrowseTheWeb.as(actor).getDriver().switchTo().window(tabs.get(1));
        actor.attemptsTo(
                Enter.theValue(usuario).into(INPUT_USUARIO).thenHit(Keys.ENTER),
                WaitUntil.the(INPUT_PASSWORD, isVisible()),
                Enter.theValue(contrasenia).into(INPUT_PASSWORD).thenHit(Keys.ENTER)
        );
    }

    public static Performable enGmail(String usuario, String contrasenia) {
        return instrumented(Autenticarse.class, usuario, contrasenia);
    }


}
