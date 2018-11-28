package co.com.devco.googlesuite.tasks;

import co.com.devco.googlesuite.tasks.builders.TranslateTheWord;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

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

    }

    public static TranslateTheWord theWord(String theWord) {

    }
}
