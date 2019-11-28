package co.com.devco.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.ArrayList;

import static co.com.devco.googlesuite.userinterfaces.LoginGmailPage.*;
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

    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        BrowseTheWeb.as(actor).getDriver().switchTo().window(tabs.get(1));
        actor.attemptsTo(
                Enter.theValue(usuario).into(INPUT_USUARIO),
                Click.on(BTN_SIGUIENTE),
                WaitUntil.the(INPUT_PASSWORD, isVisible()),
                Enter.theValue(contrasenia).into(INPUT_PASSWORD),
                Click.on(BTN_SIGUIENTE)
        );
    }

    public static Performable enGmail(String usuario, String contrasenia) {
        return instrumented(Autenticarse.class, usuario, contrasenia);
    }


}
