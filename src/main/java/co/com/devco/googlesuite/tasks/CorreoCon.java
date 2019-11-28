package co.com.devco.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.devco.googlesuite.userinterfaces.RecibidosPage.CORREO;

public class CorreoCon implements Task {

    private String asunto;
    private String remitente;

    public CorreoCon(String asunto, String remitente){
        this.asunto = asunto;
        this.remitente = remitente;
    }

    @Step("{0} busca el correo con #asunto y #remitente")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CORREO.of(remitente))
        );
    }
}
