package com.youtube.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static com.youtube.interactions.SelectVideo.getVideo;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnVideoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                getVideo()
        );
    }
    public static ClickOnVideoTask clickOnVideo(){
        return instrumented(ClickOnVideoTask.class);
    }
}
