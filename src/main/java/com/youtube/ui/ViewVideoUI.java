package com.youtube.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ViewVideoUI {
    public static final Target LIST_TITTLEVIDEO=
            Target.the("Title video")
                    .locatedBy("//a[@id='video-title']");
}
