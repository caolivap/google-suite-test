package co.com.devco.googlesuite.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.googlesuite.userinterfaces.RecibidosPage.CUERPO_CORREO;

public class Mensaje implements Question<String> {

    private String textoCorreo;

    public Mensaje(String textoCorreo){
        this.textoCorreo = textoCorreo;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CUERPO_CORREO.of(textoCorreo)).viewedBy(actor).asString();
    }

    public static Question delCorreo(String textoCorreo) {
        return new Mensaje(textoCorreo);
    }

}
