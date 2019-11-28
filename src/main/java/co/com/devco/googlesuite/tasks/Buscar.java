package co.com.devco.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.googlesuite.userinterfaces.RecibidosPage.ULTIMO_CORREO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Buscar implements Task {

    private String asunto;
    private String remitente;

    public Buscar(String asunto, String remitente){
        this.asunto = asunto;
        this.remitente = remitente;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ULTIMO_CORREO)
        );
    }

    public static Performable correoCon(String asunto, String remitente) {
        return instrumented(Buscar.class, asunto, remitente);
    }

}
