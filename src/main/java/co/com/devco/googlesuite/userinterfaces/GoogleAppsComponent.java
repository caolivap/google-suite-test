package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleAppsComponent {
	public static final Target GOOGLE_APPS = Target.the("Google Apps Button").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE_SPAN = Target.the("Google Translate TEXT").located(By.xpath("//span[text()='Traductor']"));
	public static final Target GOOGLE_APPS_CARGANDO = Target.the("Google APPS cargando").located(By.xpath("//div[@class='gb_A gb_z gb_U gb_B gb_zc'"));
	public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate Option").located(By.id("gb51"));
	public static final Target YOUTUBE = Target.the("Youtube Option").located(By.id("gb36"));

}
