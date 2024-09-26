package com.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USER_NAME = Target.the("nombre de usuario").locatedBy("name:username");
    public static final Target PASSWORD = Target.the("la contraseña").locatedBy("name:password");
    public static final Target BTN_LOGIN = Target.the("el boton de inicio").locatedBy("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    public static final Target BTN_RECLUTAMIENTO = Target.the("el boton de reclutamiento").locatedBy("(//a[@class='oxd-main-menu-item'])[5]");
    public static final Target BTN_ADD = Target.the("el boton de add").locatedBy("(/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");


}


