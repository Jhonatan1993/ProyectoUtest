package co.com.utest.stepsDefinitions;

import co.com.utest.model.DataRegistro;
import co.com.utest.questions.Verificar;
import co.com.utest.tasks.AbrirNevegador;
import co.com.utest.tasks.RegistroUtest;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import javax.xml.crypto.Data;
import java.util.List;


public class UtestStepDefinitions {
    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Jhonatan quiere registrarse en la pagina utest$")
    public void queJhonatanQuiereRegistrarseEnLaPaginaUtest() {
        OnStage.theActorCalled("Jhonatan").wasAbleTo(AbrirNevegador.pagina());
    }


    @Cuando("^el realiza el registro del mismo en la pagina web utest$")
    public void elRealizaElRegistroDelMismoEnLaPaginaWebUtest(List<DataRegistro> DataRegistro) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroUtest.formulario(DataRegistro.get(0).getNombre(),
                DataRegistro.get(0).getApellido(),
                DataRegistro.get(0).getCorreo(),
                DataRegistro.get(0).getIdioma(),
                DataRegistro.get(0).getCiudad(),
                DataRegistro.get(0).getCodigo_postal(),
                DataRegistro.get(0).getPais(),
                DataRegistro.get(0).getComputador(),
                DataRegistro.get(0).getVersion(),
                DataRegistro.get(0).getIdioma2(),
                DataRegistro.get(0).getDispositivo_mobil(),
                DataRegistro.get(0).getModelo(),
                DataRegistro.get(0).getSistema_operativo(),
                DataRegistro.get(0).getPassword(),
                DataRegistro.get(0).getConfirm_password()
               ));
    }

    @Entonces("^verifica que se presente en pantalla el mensaje$")
    public void verificaQueSePresenteEnPantallaElMensajeWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters(List<DataRegistro> DataRegistro) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.texto(DataRegistro.get(0).getTexto())));

    }
}
