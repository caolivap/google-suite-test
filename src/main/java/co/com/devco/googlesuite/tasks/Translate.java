package co.com.devco.googlesuite.tasks;

import co.com.devco.googlesuite.tasks.builders.TranslateTheWord;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.googlesuite.userinterfaces.GoogleTranslatePage.*;
import static org.openqa.selenium.Keys.ENTER;

public class Translate implements Task {

    private String theWord;
    private String theSourceLanguage;
    private String theTargetLanguage;

    public Translate(String theWord, String theSourceLanguage, String theTargetLanguage) {
        this.theWord = theWord;
        this.theSourceLanguage = theSourceLanguage;
        this.theTargetLanguage = theTargetLanguage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SOURCE_LANGUAGE_OPTION),
                Enter.theValue(theSourceLanguage).into(SOURCE_LANGUAGE).thenHit(ENTER),
                Click.on(TARGET_LANGUAGE_OPTION),
                Enter.theValue(theTargetLanguage).into(TARGET_LANGUAGE).thenHit(ENTER),
                Enter.theValue(theWord).into(SOURCE_LANGUAGE_TEXTAREA)
        );
    }

    public static TranslateTheWord theWord(String theWord) {
        return new TranslateTheWord(theWord);
    }
}
