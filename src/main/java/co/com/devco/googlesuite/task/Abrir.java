package co.com.devco.googlesuite.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.googlesuite.userinterfaces.GoogleAppsComponent.*;
import static co.com.devco.googlesuite.userinterfaces.GoogleHomePage.GOOGLE_HOME_PAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Abrir implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(GOOGLE_HOME_PAGE),
                Click.on(GOOGLE_APPS),
                //WaitUntil.the(GOOGLE_APPS_CARGANDO,isCurrentlyVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(GOOGLE_TRANSLATE_SPAN,isCurrentlyVisible()).forNoMoreThan(5).seconds(),
                Click.on(GOOGLE_TRANSLATE)
        );
    }

    public static Performable googleTranslate() {
        return instrumented(Abrir.class);
    }
}
