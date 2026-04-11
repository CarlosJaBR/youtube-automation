package com.youtube.stepDefinitions;

import com.youtube.questions.ValidatePlayVideo;
import com.youtube.tasks.ClickOnSearchTask;
import com.youtube.tasks.ClickOnVideoTask;
import com.youtube.tasks.OpenBrowserTask;
import com.youtube.tasks.SendNameVideoTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
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
                ClickOnSearchTask.clickOnSearch(),
                ClickOnVideoTask.clickOnVideo()
        );
    }
    @Then("user can see the title video")
    public void userCanSeeTheTitleVideo() {
        theActorInTheSpotlight().should(
                seeThat(
                        "El titutlo del video es visible",
                        ValidatePlayVideo.isVisible()
                )
        );
    }

}
