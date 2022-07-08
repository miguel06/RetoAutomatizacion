package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UtestForm extends PageObject {
    public static final Target FORM = Target.the("registration form").located(By.linkText("Join Today"));
    public static final Target INPUT_FIRSTNAME = Target.the(" nombre ").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("apellido").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("email").located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("mes de nacimiento").located(By.name("birthMonth"));
    public static final Target INPUT_DAY = Target.the("dia de nacimiento").located(By.name("birthDay"));
    public static final Target INPUT_YEAR = Target.the("año de nacimiento").located(By.name("birthYear"));
    public static final Target INPUT_COURSE = Target.the("buscar idioma").located(By.xpath("//input[@class=\"ui-select-search input-xs ng-pristine ng-untouched ng-valid ng-empty\"]"));
    public static final Target NEXT_BUTTON = Target.the("boton para continuar").located(By.xpath("//div[@class=\"form-group col-xs-12 text-right\"]/a[@class='btn btn-blue']"));
    public static final Target INPUT_CITY = Target.the("escribir la ciudad").located(By.id("city"));
    public static final Target INPUT_CITYPSELECT = Target.the("seleccionar la ciudad").located(By.xpath("//*[@class=\"pac-matched\"]"));
    public static final Target INPUT_ZIP = Target.the("codigo postal").located(By.id("zip"));
    public static final Target NEXT_BUTTON2 = Target.the("continuar").located(By.xpath("//*[@class=\"btn btn-blue pull-right\"]"));
    public static final Target INPUT_SIS = Target.the("sistema operativo").located(By.xpath("//*[@class=\"btn btn-default form-control ui-select-toggle\"]"));
    public static final Target INPUT_VERSION = Target.the("version de windows").located(By.xpath("//*[@ng-bind-html=\"device.name | highlight: $select.search\"]"));
    public static final Target INPUT_PASSWORD = Target.the(" ingresar contraseña ").located(By.id("password"));
    public static final Target INPUT_CONF_PASSWORD = Target.the("  confirmar contraseña ").located(By.id("confirmPassword"));
    public static final Target INPUT_CHECK = Target.the("version de windows").located(By.xpath("//*[@class=\"checkmark signup-consent__checkbox error\"]"));
    public static final Target INPUT_CHECK2 = Target.the("version de windows").located(By.xpath("//*[@class=\"checkmark signup-consent__checkbox error\"]"));
    public static final Target OK_BUTTON = Target.the("registro completado").located(By.id("laddaBtn"));


}
