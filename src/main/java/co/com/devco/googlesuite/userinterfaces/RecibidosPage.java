package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class RecibidosPage extends PageObject {

    public static final Target ULTIMO_CORREO = Target.the("Último correo recibido").locatedBy("//tr[@role='row'][1]");

    public static final Target CORREO = Target.the("El correo con remitente y asunto").locatedBy("//div[@class='yW']//span[@email='{0}']");

    public static final Target CUERPO_CORREO = Target.the("Texto del cuerpo del correo").locatedBy("//div[contains(text(),'{0}')]");
    //div[@class='ii gt']//div[contains(text(),'Este es el Correo de Test 1')]


}
