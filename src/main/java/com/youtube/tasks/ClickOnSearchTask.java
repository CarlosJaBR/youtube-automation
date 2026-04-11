package com.youtube.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.youtube.ui.HomeUI.BTN_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickOnSearchTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                WaitUntil.the(BTN_SEARCH, isVisible()).
                        forNoMoreThan(20).seconds(),
                Click.on(BTN_SEARCH)
        );
    }
    public static ClickOnSearchTask clickOnSearch(){
        return instrumented(ClickOnSearchTask.class);
    }
}
