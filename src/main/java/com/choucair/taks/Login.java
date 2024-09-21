package com.choucair.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Login implements Task {

    private String user;
    private String password;
    private Target fieldUser;
    private Target fieldPassword;
    private Target btnLogin;

    public Login(String user, String password, Target fieldUser, Target fieldPassword, Target btnLogin) {
        this.user = user;
        this.password = password;
        this.fieldUser = fieldUser;
        this.fieldPassword = fieldPassword;
        this.btnLogin = btnLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(fieldUser),
                Enter.theValue(password). into(fieldPassword),
                Click.on(btnLogin));
    }

    public static Login in (String user, String password, Target fieldUser, Target fieldPassword, Target btnLogin){
        return Tasks.instrumented(Login.class, user, password, fieldUser, fieldPassword, btnLogin);
    }

}
