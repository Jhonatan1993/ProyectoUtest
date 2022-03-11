package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuario extends PageObject {

    //Formulario parte 1
    public static final Target BTN_REGISTRARSE = Target.the("Boton opcion registrase")
        .located(By.xpath("//a[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
    public static final Target NOMBRE = Target.the("Ingresar nombre")
            .located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("Ingresar apellido")
            .located(By.id("lastName"));
    public static final Target CORREO = Target.the("Ingresar correo electronico")
            .located(By.id("email"));
    public static final Target FECHA_MES = Target.the("Ingresar mes de la fecha de nacimiento")
            .located(By.xpath("//option[contains(@label,'February')]"));
    public static final Target FECHA_DIA = Target.the("Ingresar dia de la fecha de nacimiento")
            .located(By.xpath("//option[contains(@value,'number:13')]"));
    public static final Target FECHA_ANO = Target.the("Ingresar año de la fecha de nacimiento")
            .located(By.xpath("//option[contains(@value,'number:1993')]"));
    public static final Target IDIOMA = Target.the("Ingresar idiomas que habla")
            .located(By.xpath("//div/input[contains(@type,'search')]"));
    public static final Target BTN_SIGUIENTE_UNO = Target.the("Opcion siguiente")
            .located(By.xpath("//a[contains(@class,'btn btn-blue')]"));
    //Formulario parte 2
    public static final Target CIUDAD =  Target.the("Ingresar ciudad donde vive")
            .located(By.id("city"));
    public static final Target CODIGO_POSTAL = Target.the("Ingresar codigo postal")
            .located(By.id("zip"));
    public static final Target PAIS = Target.the("Ingresar pais donde vive")
            .located(By.xpath("//div[contains(@name,'countryId')]"));
    public static final Target PAIS_DOS = Target.the("Ingresar pais donde vive")
            .located(By.xpath("//div/input[contains(@aria-owns,'ui-select-choices-2')]"));
    public static final Target BTN_SIGUIENTE_DOS = Target.the("Opcion siguiente")
            .located(By.xpath("//div[contains(@class,'pull-right next-step')]/a[contains(@class,'btn btn-blue pull-right')]"));
    //Formulario parte 3
    public static final Target COMPUTADOR = Target.the("Ingresar el sistema operativo del computador")
            .located(By.xpath("//div[contains(@name,'osId')]"));
    public static final Target COMPUTADOR_DOS = Target.the("Ingresar el sistema operativo del computador")
            .located(By.xpath("//span[contains(@class,'ui-select-choices-row-inner')]/div[contains(text(),'Linux')]"));
    public static final Target VERSION = Target.the("Ingresar la version del sistema operativo del computador")
            .located(By.xpath("//div[contains(@name,'osVersionId')]"));//input[contains(@placeholder,'Select a Version')]
    public static final Target VERSION_DOS = Target.the("Ingresar la version del sistema operativo del computador")
            .located(By.xpath("//span[contains(@class,'ui-select-choices-row-inner')]/div[contains(text(),'Fedora')]"));
    public static final Target IDIOMA_DOS = Target.the("Ingresar el idioma del sistema operativo")
            .located(By.xpath("//div[contains(@name,'osLanguageId')]"));
    public static final Target IDIOMA_DOS_X = Target.the("Ingresar el idioma del sistema operativo")
            .located(By.xpath("//span[contains(@class,'ui-select-choices-row-inner')]/div[contains(text(),'Spanish')]"));
    public static final Target DISPOSITIVO_MOVIL = Target.the("Seleccionar el tipo de dispositivo movil")
            .located(By.xpath("//div[contains(@name,'handsetMakerId')]"));
    public static final Target DISPOSITIVO_MOVIL_DOS = Target.the("Seleccionar el tipo de dispositivo movil")
            .located(By.xpath("//span[contains(@class,'ui-select-choices-row-inner')]/div[contains(text(),'Motorola')]"));
    public static final Target MODELO =  Target.the("Seleccionar el modelo del movil")
            .located(By.xpath("//div[contains(@name,'handsetModelId')]"));
    public static final Target MODELO_DOS =  Target.the("Seleccionar el modelo del movil")
            .located(By.xpath("//span[contains(@class,'ui-select-choices-row-inner')]/div[contains(text(),'Moto G8 Power')]"));
    public static final Target SISTEMA_OPERATIVO = Target.the("Seleccionar el sistema operatico del movil")
            .located(By.xpath("//div[contains(@name,'handsetOSId')]"));
    public static final Target SISTEMA_OPERATIVO_DOS = Target.the("Seleccionar el sistema operatico del movil")
            .located(By.xpath("//span[contains(@class,'ui-select-choices-row-inner')]/div[contains(text(),'Android 11')]"));
    public static final Target BTN_SIGUIENTE_TRES = Target.the("Opcion siguiente")
            .located(By.xpath("//div[contains(@class,'pull-right next-step')]/a[contains(@class,'btn btn-blue pull-right')]"));
    //Formulario parte 4
    public static final Target PASSWORD = Target.the("Ingresar la contraseña")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Ingresar confirmacion de la contraseña")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_UNO = Target.the("Seleccionar checkbox uno")
            .located(By.xpath("//input[contains(@name,'newsletterOptIn')]"));
    public static final Target CHECKBOX_DOS = Target.the("Seleccionar checkbox dos")
            .located(By.id("termOfUse"));
    public static final Target CHECKBOX_TRES = Target.the("Seleccionar checkbox tres")
            .located(By.id("privacySetting"));
    public static final Target BTN_FINALIZAR = Target.the("Seleccionar boton finalizar registro")
            .located(By.id("laddaBtn"));
    public static final Target TEXTO = Target.the("Texto a verificar")
            .located(By.xpath("//div[contains(@class,'image-box-header')]/h1[text()]"));




}
