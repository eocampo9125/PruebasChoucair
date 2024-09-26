package com.choucair.steps;

import com.choucair.emuns.MsgError;
import com.choucair.exceptions.NotIsEqual;
import com.choucair.questions.TextOf;
import com.choucair.taks.Login;
import com.choucair.utils.Constant;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.choucair.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static com.choucair.userinterfaces.HomePage.TITLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginStep {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @Given("^\"([^\"]*)\" desea ir a la página inicial$")
    public void deseaIrALaPáginaInicial(String actorName) {
        theActorCalled(actorName).wasAbleTo(Open.url(Constant.URL_GURU));
    }

    @When("^inicia sesión con los datos \"([^\"]*)\" y \"([^\"]*)\"$")
    public void iniciaSesiónConLosDatosY(String user, String password) {
        theActorInTheSpotlight().attemptsTo(Login.in(user, password, USER_NAME, PASSWORD, BTN_LOGIN, BTN_RECLUTAMIENTO));
    }

//    @Then("^valida que el mensaje inicial sea \"([^\"]*)\"$")
//    public void validaQueElMensajeInicialSea(String message) {
//       theActorInTheSpotlight().should(seeThat(TextOf.field(TITLE), equalTo(message))
//               .orComplainWith(NotIsEqual.class, String.format(MsgError.MSG_ERROR_COMPARE_TEXT.getMsg(),
//                       message)));
//    }


//    @Then("^El usuario ingresa el nombre \"([^\"]*)\"$")
//    public void elUsuarioIngresaElNombre(String name) {
//        theActorInTheSpotlight().attemptsTo(Login.in(name, ));
//    }
}
