package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class RecibidosPage extends PageObject {

    public static final Target ULTIMO_CORREO = Target.the("Último correo recibido").locatedBy("//tr[@role='row'][1]");
}
