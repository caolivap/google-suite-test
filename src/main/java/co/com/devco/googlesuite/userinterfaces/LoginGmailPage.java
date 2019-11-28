package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginGmailPage extends PageObject {

    public static final Target INPUT_USUARIO = Target.the("Campo de ingreso de usuario").located(By.id("identifierId"));

    public static final Target BTN_SIGUIENTE = Target.the("Botón Siguiente").locatedBy("//span[contains(text(),'Siguiente')]");

    public static final Target INPUT_PASSWORD = Target.the("Campo de ingreso de contraseña").locatedBy("//input[@type='password']");


}
