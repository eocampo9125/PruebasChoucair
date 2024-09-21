package com.choucair.steps;


import com.choucair.utils.Constant;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateStep {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @Given("^El usuario está en la opción de creación de empleados$")
    public void elUsuarioEstaEnLaOpcionDeCreacionDeEmpleados() {
        theActorCalled("usuario").wasAbleTo(Open.url(Constant.URL_GURU));
    }

    @When("^El usuario ingresa el nombre \"([^\"]*)\"$")
    public void elUsuarioIngresaElNombre(String nombre) {
        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(nombre).into()
        );
    }

}