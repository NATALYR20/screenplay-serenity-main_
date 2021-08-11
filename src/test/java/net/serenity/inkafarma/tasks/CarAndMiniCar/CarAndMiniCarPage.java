package net.serenity.inkafarma.tasks.CarAndMiniCar;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarAndMiniCarPage {

   public static Target MINICART_BUTTON = Target.the("minicart button")
            .locatedBy("//body[1]/fp-root[1]/fp-business[1]/div[1]/fp-header[1]/main[1]/header[1]/fp-header-desktop[1]/fp-navigation-header[1]/nav[1]/div[1]/div[1]/div[2]/fp-header-cart[1]/div[1]/label[1]/span[1]");

   public static Target BUY_NOW_BUTTON = Target.the("go to buy now")
           .locatedBy("//button[@id='btn--go-to-checkout']");

   public static Target WITHOUT_LOGIN_BUTTON_1 = Target.the("Continue without logging in modal 1")
           .locatedBy("//a[contains(text(),'Continúa sin iniciar sesión')]");

   public static Target WITHOUT_LOGIN_BUTTON_2 = Target.the("Continue without logging in modal 2")
           .locatedBy("//button[contains(text(),'Continuar sin iniciar sesión')]");


}
