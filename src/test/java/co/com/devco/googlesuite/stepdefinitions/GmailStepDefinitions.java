package co.com.devco.googlesuite.stepdefinitions;

import co.com.devco.googlesuite.tasks.Abrir;
import co.com.devco.googlesuite.tasks.Autenticarse;
import co.com.devco.googlesuite.tasks.Buscar;
import co.com.devco.googlesuite.tasks.Entrar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.googlesuite.tasks.SuiteUrl.GOOGLE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GmailStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("(.*) se encuentra en la bandeja de entrada de Gmail con usuario (.*) y contraseña (.*)")
    public void carlosDeseaRevisarCorreosElectrónicosEnSuBandejaDeEntrada(String nombreActor, String usuario, String contrasenia) {
        theActorCalled(nombreActor).attemptsTo(
                Abrir.laPaginaDe(GOOGLE),
                Entrar.aGmail(),
                Autenticarse.enGmail(usuario, contrasenia)
        );
    }

    @Cuando("busca el correo con asunto (.*) del remitente (.*)")
    public void buscaElCorreoConAsuntoYDestinatario(String asunto, String remitente) {
        theActorInTheSpotlight().attemptsTo(
                Buscar.correoCon(asunto, remitente)
        );
    }

    @Entonces("encuentra en el cuerpo del mensaje el texto (.*)")
    public void encuentraEnElCuerpoDelMensajeElTexto(String texto) {

    }
}
