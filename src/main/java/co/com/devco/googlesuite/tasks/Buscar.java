package co.com.devco.googlesuite.tasks;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Buscar{

    public static Performable correoCon(String asunto, String remitente) {
        return instrumented(CorreoCon.class, asunto, remitente);
    }

    public static Performable enGoogle(String mensaje) {
        return instrumented(EnGoogle.class, mensaje);
    }

}
