package com.choucair.steps;


import com.choucair.taks.Create;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static com.choucair.userinterfaces.AddCandidatesPage.Add_candidate;

public class CreateStep {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }
//    @Given("^El usuario está en la opción de creación de empleados$")
//    public void elUsuarioEstáEnLaOpciónDeCreaciónDeEmpleados() {
//        theActorInTheSpotlight().attemptsTo(Create.in(Add_candidate));
//    }
//
//    @When("^El usuario ingresa el nombre \"([^\"]*)\"$")
//    public void elUsuarioIngresaElNombre(String arg1) {
//        // Write code here that turns the phrase above into concrete actions
//    }


    @When("^El usuario ingresa el apellido \"([^\"]*)\"$")
    public void elUsuarioIngresaElApellido(String arg1) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^El usuario selecciona la vacante$")
    public void elUsuarioSeleccionaLaVacante() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^El usuario ingresa el correo \"([^\"]*)\"$")
    public void elUsuarioIngresaElCorreo(String arg1) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^El usuario ingresa el numero de contacto \"([^\"]*)\"$")
    public void elUsuarioIngresaElNumeroDeContacto(String arg1) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^El usuario hace clic en el botón \"([^\"]*)\"$")
    public void elUsuarioHaceClicEnElBotón(String arg1) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^El sistema debe almacenar la información del empleado$")
    public void elSistemaDebeAlmacenarLaInformaciónDelEmpleado() {
        // Write code here that turns the phrase above into concrete actions
    }

    }
