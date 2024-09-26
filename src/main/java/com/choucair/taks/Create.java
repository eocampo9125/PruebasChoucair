package com.choucair.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Create implements Task {

    private Target AddCandidate;

    public Create(Target addCandidate) {
        AddCandidate = addCandidate;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(AddCandidate);
    }

    public static Create in (Target addCandidate){
        return Tasks.instrumented(Create.class, addCandidate);

    }
}
