package com.choucair.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class Login implements Task {

    private String user;
    private String password;
    private Target fieldUser;
    private Target fieldPassword;
    private Target btnLogin;
    private Target btnReclutamiento;


    public Login(String user, String password, Target fieldUser, Target fieldPassword, Target btnLogin, Target btnReclutamiento, Target btnAdd) {
        this.user = user;
        this.password = password;
        this.fieldUser = fieldUser;
        this.fieldPassword = fieldPassword;
        this.btnLogin = btnLogin;
        this.btnReclutamiento = btnReclutamiento;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(fieldUser),
                Enter.theValue(password).into(fieldPassword),
                Click.on(btnLogin)
        );actor.attemptsTo(
                DoubleClick.on(btnReclutamiento));


    }




    public static Login in (String user, String password, Target fieldUser, Target fieldPassword, Target btnLogin, Target btnReclutamiento, Target btnAdd){
        return Tasks.instrumented(Login.class, user, password, fieldUser, fieldPassword, btnLogin, btnReclutamiento, btnAdd);
    }

}
