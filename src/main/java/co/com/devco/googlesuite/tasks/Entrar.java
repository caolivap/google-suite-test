package co.com.devco.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.googlesuite.userinterfaces.GoogleHomePage.GMAIL_LINK;
import static co.com.devco.googlesuite.userinterfaces.GmailHomePage.LINK_ACCEDER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Entrar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GMAIL_LINK),
                Click.on(LINK_ACCEDER)
        );
    }

    public static Performable aGmail() {
        return instrumented(Entrar.class);
    }

}
