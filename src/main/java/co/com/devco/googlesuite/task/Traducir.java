package co.com.devco.googlesuite.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilAngularIsReady;
import org.openqa.selenium.Keys;

import static co.com.devco.googlesuite.userinterfaces.GoogleTranslatePage.*;
import static co.com.devco.googlesuite.userinterfaces.GoogleTranslatePage.SOURCE_LANGUAGE_TEXTAREA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Traducir implements Task {
    private String palabra;
    private String idiomaEntrada;
    private String idiomaSalida;

    public Traducir(String palabra, String idiomaEntrada, String idiomaSalida){
        this.palabra = palabra;
        this.idiomaEntrada = idiomaEntrada;
        this.idiomaSalida = idiomaSalida;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SOURCE_LANGUAGE_OPTION),
                Enter.theValue(this.idiomaEntrada).into(SOURCE_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(TARGET_LANGUAGE_OPTION),
                Enter.theValue(this.idiomaSalida).into(TARGET_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(SOURCE_LANGUAGE_TEXTAREA),
                Enter.theValue(this.palabra).into(SOURCE_LANGUAGE_TEXTAREA)
        );
    }

    public static TraducirBuilder laPalabra(String palabra){
        return new TraducirBuilder(palabra);
    }

    public static class TraducirBuilder {
        private String palabra;
        private String idiomaEntrada;
        private String idiomaSalida;

        public TraducirBuilder(String palabra) {
            this.palabra = palabra;
        }

        public TraducirBuilder de(String idiomaEntrada){
            this.idiomaEntrada = idiomaEntrada;
            return this;
        }

        public Traducir a (String idiomaSalida){
            this.idiomaSalida = idiomaSalida;
            return instrumented(Traducir.class, this.palabra, this.idiomaEntrada, this.idiomaSalida);
        }
    }
}
