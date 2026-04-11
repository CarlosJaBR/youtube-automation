package com.youtube.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.youtube.ui.HomeUI.BTN_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnSearchTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(BTN_SEARCH)
        );
    }
    public static ClickOnSearchTask clickOnSearch(){
        return instrumented(ClickOnSearchTask.class);
    }
}
