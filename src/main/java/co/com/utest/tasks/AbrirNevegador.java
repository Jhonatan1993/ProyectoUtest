package co.com.utest.tasks;

import co.com.utest.userinterface.AbrirPaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNevegador implements Task {

    private AbrirPaginaUtest abrirPaginaUtest;
    public static AbrirNevegador pagina() {
        return Tasks.instrumented(AbrirNevegador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirPaginaUtest));
    }
}
