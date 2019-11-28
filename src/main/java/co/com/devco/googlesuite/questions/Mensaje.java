package co.com.devco.googlesuite.questions;

import co.com.devco.googlesuite.userinterfaces.RecibidosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.googlesuite.userinterfaces.RecibidosPage.CUERPO_CORREO;

public class Mensaje implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CUERPO_CORREO).viewedBy(actor).asString();
    }

    public static Question delCorreo() {
        return new Mensaje();
    }

}
