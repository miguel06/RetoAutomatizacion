package co.com.choucair.certification.proyectobase.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Form;
import tasks.OpenUp;
import tasks.JoinToday;

public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^I want to register in Utest$")
    public void iWantToRegisterInUtest() {
        OnStage.theActorCalled( "Miguel").wasAbleTo(OpenUp.thePage());
    }


    @When("^enter the registration option$")
    public void enterTheRegistrationOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.onThePage());

    }

    @Then("^I must fill in the necessary information to register$")
    public void iMustFillInTheNecessaryInformationToRegister() {
        OnStage.theActorInTheSpotlight().attemptsTo(Form.thePage());
    }

}
