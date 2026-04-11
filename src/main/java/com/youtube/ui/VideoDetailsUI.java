package com.youtube.ui;

import net.serenitybdd.screenplay.targets.Target;

public class VideoDetailsUI {
    public static final Target LBL_NAMEVIDEO=
        Target.the("Name video").
            locatedBy("//h1[@class='style-scope ytd-watch-metadata']");
}
