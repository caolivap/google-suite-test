package co.com.devco.googlesuite.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.googlesuite.userinterfaces.GoogleTranslatePage.TARGET_LANGUAGE_RESULT;

public class Traduccion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TARGET_LANGUAGE_RESULT).viewedBy(actor).asString().
                replace("\n ", "");
    }

    public static Traduccion is() {
        return new Traduccion();
    }
}
