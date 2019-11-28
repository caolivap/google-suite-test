package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;



public class GmailHomePage extends PageObject {

    public static final Target LINK_ACCEDER = Target.the("Link al Login de Gmail").locatedBy(
            "//li[@class='h-c-header__nav-li g-mail-nav-links']//a[@class='h-c-header__nav-li-link ' and contains(text(), 'Iniciar sesión')]");

}
