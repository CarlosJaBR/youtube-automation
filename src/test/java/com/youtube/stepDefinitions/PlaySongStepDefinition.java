package com.youtube.stepDefinitions;

import com.youtube.tasks.ClickOnSearchTask;
import com.youtube.tasks.OpenBrowserTask;
import com.youtube.tasks.SendNameVideoTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PlaySongStepDefinition {

    private EnvironmentVariables env;

    @Given("user open the browser")
    public void userOpenTheBrowser() {
        theActorInTheSpotlight().wasAbleTo(
                OpenBrowserTask.openBrowser()
        );
    }
    @When("user send the video name")
    public void userSendTheVideoName() {
        theActorInTheSpotlight().attemptsTo(
                SendNameVideoTask.forSearch()
        );
    }
    @When("user click on video")
    public void userClickOnVideo() {
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTask.clickOnSearch()
        );
    }
    @Then("user can see the title video")
    public void userCanSeeTheTitleVideo() {
    }

}
