package com.youtube.ui;


import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target TXT_SEARCH=
            Target.the("search bar")
                    .locatedBy("//input[@name='search_query']");

    public static final Target BTN_SEARCH=
            Target.the("button search")
                    .locatedBy("//button[@title='Buscar']");


}
