package com.youtube.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import java.util.ArrayList;
import java.util.Random;

import static com.youtube.ui.ViewVideoUI.LIST_TITTLEVIDEO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectVideo implements Interaction {

    @Override
    public <T extends Actor> void performAs(T t) {
        ArrayList<WebElementFacade> listVideos = LIST_TITTLEVIDEO.resolveAllFor(t);
        ArrayList<WebElementFacade> filteredVideos = new ArrayList<>();

        for(int i = 0; i < listVideos.size(); i++) {

            if((listVideos.get(i).getText().contains("Luis Fonsi"))){
                filteredVideos.add(listVideos.get(i));
            }
        }

        Random random = new Random();
        int indexVideo = random.nextInt(filteredVideos.size());
        WebElementFacade video = filteredVideos.get(indexVideo);
        t.attemptsTo(
                Click.on(video)
        );
    }

    public static SelectVideo getVideo(){
        return instrumented(SelectVideo.class);
    }
}
