package co.com.utest.tasks;

import co.com.utest.userinterface.RegistroUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistroUtest implements Task {


    private  RegistroUsuario registroUsuario;

    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String idioma;
    private final String ciudad;
    private final String codigo_postal;
    private final String pais;
    private final String computador;
    private final String version;
    private final String idioma2;
    private final String dispositivo_mobil;
    private final String modelo;
    private final String sistema_operativo;
    private final String password;
    private final String confirm_password;

    public RegistroUtest(String nombre, String apellido, String correo, String idioma, String ciudad, String codigo_postal, String pais, String computador, String version, String idioma2, String dispositivo_mobil, String modelo, String sistema_operativo, String password, String confirm_password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.idioma = idioma;
        this.ciudad = ciudad;
        this.codigo_postal = codigo_postal;
        this.pais = pais;
        this.computador = computador;
        this.version = version;
        this.idioma2 = idioma2;
        this.dispositivo_mobil = dispositivo_mobil;
        this.modelo = modelo;
        this.sistema_operativo = sistema_operativo;
        this.password = password;

        this.confirm_password = confirm_password;
    }

    public static RegistroUtest formulario(String nombre, String apellido, String correo, String idioma, String ciudad, String codigo_postal,
                                           String pais, String computador, String version, String idioma2,
                                           String dispositivo_mobil, String modelo, String sistema_operativo,
                                           String password, String confirm_password) {

        return Tasks.instrumented(RegistroUtest.class, nombre, apellido, correo, idioma,
                ciudad, codigo_postal, pais, computador, version, idioma2, dispositivo_mobil,
                modelo, sistema_operativo, password, confirm_password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistroUsuario.BTN_REGISTRARSE),
                Enter.theValue(nombre).into(RegistroUsuario.NOMBRE),
                Enter.theValue(apellido).into(RegistroUsuario.APELLIDO),
                Enter.theValue(correo).into(RegistroUsuario.CORREO),
                Click.on(RegistroUsuario.FECHA_MES),
                Click.on(RegistroUsuario.FECHA_DIA),
                Click.on(RegistroUsuario.FECHA_ANO),
                Enter.theValue(idioma).into(RegistroUsuario.IDIOMA),
                Click.on(RegistroUsuario.BTN_SIGUIENTE_UNO),
                Enter.theValue(ciudad).into(RegistroUsuario.CIUDAD),
                Enter.theValue(codigo_postal).into(RegistroUsuario.CODIGO_POSTAL),
                Click.on(RegistroUsuario.PAIS),
                Enter.theValue(pais).into(RegistroUsuario.PAIS_DOS),
                Click.on(RegistroUsuario.BTN_SIGUIENTE_DOS),
                Click.on(RegistroUsuario.COMPUTADOR),
                Click.on(RegistroUsuario.COMPUTADOR_DOS),
                Click.on(RegistroUsuario.VERSION),
                Click.on(RegistroUsuario.VERSION_DOS),
                Click.on(RegistroUsuario.IDIOMA_DOS),
                Click.on(RegistroUsuario.IDIOMA_DOS_X),
                Click.on(RegistroUsuario.DISPOSITIVO_MOVIL),
                Click.on(RegistroUsuario.DISPOSITIVO_MOVIL_DOS),
                Click.on(RegistroUsuario.MODELO),
                Click.on(RegistroUsuario.MODELO_DOS),
                Click.on(RegistroUsuario.SISTEMA_OPERATIVO),
                Click.on(RegistroUsuario.SISTEMA_OPERATIVO_DOS),
                Click.on(RegistroUsuario.BTN_SIGUIENTE_TRES),
                Enter.theValue(password).into(RegistroUsuario.PASSWORD),
                Enter.theValue(confirm_password).into(RegistroUsuario.CONFIRM_PASSWORD),
                Click.on(RegistroUsuario.CHECKBOX_UNO),
                Click.on(RegistroUsuario.CHECKBOX_DOS),
                Click.on(RegistroUsuario.CHECKBOX_TRES),
                Click.on(RegistroUsuario.BTN_FINALIZAR)


                );


    }


}
