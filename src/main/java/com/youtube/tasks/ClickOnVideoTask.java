package com.youtube.tasks;

import com.youtube.ui.ViewVideoUI;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;

import static com.youtube.ui.ViewVideoUI.LIST_TITTLEVIDEO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnVideoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        ArrayList<WebElementFacade> listVideos = LIST_TITTLEVIDEO.resolveAllFor(t);
        WebElementFacade video = listVideos.get(0);
        t.attemptsTo(
                Click.on(video)
        );
    }
    public static ClickOnVideoTask clickOnVideo(){
        return instrumented(ClickOnVideoTask.class);
    }
}
