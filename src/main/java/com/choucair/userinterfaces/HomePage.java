package com.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target TITLE = Target.the("el mensaje de inicio de sesión")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/p");

}
