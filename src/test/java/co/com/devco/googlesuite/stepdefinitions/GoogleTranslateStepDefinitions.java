package co.com.devco.googlesuite.stepdefinitions;

import co.com.devco.googlesuite.tasks.Go;
import co.com.devco.googlesuite.tasks.Open;
import co.com.devco.googlesuite.tasks.Translate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.googlesuite.tasks.SuiteUrl.GOOGLE;
import static co.com.devco.googlesuite.userinterfaces.GoogleAppsComponent.GOOGLE_TRANSLATE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GoogleTranslateStepDefinitions {

    private final String SUSAN = "Susan";

	@Before
	public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
	}

    @Given("^that Susan wants to translate a word$")
    public void thatSusanWantsToTranslateAWord() throws Exception {
	    theActorCalled(SUSAN).attemptsTo(
	            Go.to(GOOGLE),
                Open.the(GOOGLE_TRANSLATE)
        );
    }

    @When("^she translates the word (.*) from (.*) to (.*)$")
    public void sheTranslatesTheWordCheeseFromInglésToEspañol(String theWord, String theSourceLanguage, String theTargetLanguage) throws Exception {
	    theActorInTheSpotlight().attemptsTo(
	            Translate.theWord(theWord).from(theSourceLanguage).to(theTargetLanguage)
        );
    }

    @Then("^she should see the word (.*) in the screen$")
    public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {
    }


}
