package com.youtube.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowserTask implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Open.url("https://youtube.com")
        );
    }
    public static OpenBrowserTask openBrowser(){
        return instrumented(OpenBrowserTask.class);
    }
}
