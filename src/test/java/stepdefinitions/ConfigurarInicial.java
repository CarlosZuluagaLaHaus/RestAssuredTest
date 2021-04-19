package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.Enum.EnumVariableSesion.ID_EMPLEADO;
import static utils.Enum.RecursoServicio.*;

public class ConfigurarInicial {

    @Before
    public void configurarActor() {
        setTheStage(new OnlineCast());
        theActorCalled("Wilson");
    }

    @Dado("que Wilson desea consumir la api de Dummy")
    public void obtenerApi() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(API_DUMMI.getRecurso()));
        theActorInTheSpotlight().attemptsTo(Get.resource(GET.getRecurso()));
         /*theActorInTheSpotlight().attemptsTo(Post.to(CREACION.getRecurso())
                .with(request -> request.headers
                        ("Referer", "https://sobreplanos-staging-pr-8520.herokuapp.com/apartamentos/medellin?new_srp=true&pagina=1"
                                ,"Content-Type", "application/json")
                        .body("{\"filters\":{\"locations\":\"medellin/el-poblado\",\"search_label\":\"apartamentos\",\"price\":\"500:3000\",\"bedrooms\":2,\"garage_units\":2,\"bathrooms\":2,\"is_new\":false,\"pagina\":1},\"type\":\"full\"}").log().all()));
        */
        int statusCode = SerenityRest.lastResponse().statusCode();
        System.out.println(statusCode);
        //SerenityRest.lastResponse().prettyPrint();
    }

}
