package co.com.devco.googlesuite.stepdefinitions;

import co.com.devco.googlesuite.question.Traduccion;
import co.com.devco.googlesuite.task.Abrir;
import co.com.devco.googlesuite.task.Traducir;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class GoogleTranslateStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^\"(.*)\" quiere traducir una palabra$")
    public void quiereTraducirPalabra(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Abrir.googleTranslate()
        );
    }

    @Cuando("^(?:ella|el) traduce la palabra \"(.*)\" de \"(.*)\" a \"(.*)\"$")
    public void traducePalabra(String palabra, String idiomaEntrada, String idiomaSalida) {
        theActorInTheSpotlight().attemptsTo(
                Traducir.laPalabra(palabra)
                        .de(idiomaEntrada)
                        .a(idiomaSalida)
        );
    }

    @Entonces("^(?:ella|el) debe ver la palabra \"(.*)\"$")
    public void debeVerLaPalabra(String traduccion) {
        theActorInTheSpotlight().should(eventually(seeThat(Traduccion.is(),
                equalTo(traduccion))));
    }
}
