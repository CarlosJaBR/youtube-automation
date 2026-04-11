package com.youtube.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.youtube.ui.VideoDetailsUI.LBL_NAMEVIDEO;

public class ValidatePlayVideo implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return LBL_NAMEVIDEO.resolveFor(actor).isVisible();
    }
    public static ValidatePlayVideo isVisible(){
        return new ValidatePlayVideo();
    }
}
