package com.youtube.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.youtube.ui.HomeUI.TXT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SendNameVideoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Enter.theValue("Java").into(TXT_SEARCH)
        );
    }
    public static SendNameVideoTask forSearch(){
        return instrumented(SendNameVideoTask.class);

    }
}
