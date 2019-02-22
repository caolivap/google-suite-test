package co.com.devco.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static co.com.devco.googlesuite.userinterfaces.GoogleAppsComponent.GOOGLE_APPS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Go implements Task {

    private String url;

    public Go(String url) {
      this.url = url;
    }

    @Step("{0} wants to go to #url")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url),
                Click.on(GOOGLE_APPS)
        );
    }

    public static Performable to(SuiteUrl app) {
        return instrumented(Go.class, app.url());
    }
}
