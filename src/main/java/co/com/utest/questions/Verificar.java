package co.com.utest.questions;

import co.com.utest.userinterface.RegistroUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question<Boolean> {

    private String datoTexto;

    public Verificar(String datoTexto) {
        this.datoTexto = datoTexto;
    }

    public static Verificar texto(String datoTexto) {
        return new Verificar(datoTexto);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String verificarTexto = Text.of(RegistroUsuario.TEXTO).viewedBy(actor).asString();
        if (datoTexto.equals(verificarTexto)){
            resultado = true;
        }else {
            resultado = false;
        }
        return resultado;
    }
}
