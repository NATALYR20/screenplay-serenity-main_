package net.serenity.inkafarma.tasks.CarAndMiniCar;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CarAndMiniCar {

    public static Performable IrToCart() {
        return Task.where("Click on the Cart",
                WaitUntil.the(CarAndMiniCarPage.MINICART_BUTTON,WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CarAndMiniCarPage.MINICART_BUTTON),
                WaitUntil.the(CarAndMiniCarPage.BUY_NOW_BUTTON,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds(),
                WaitUntil.the(CarAndMiniCarPage.BUY_NOW_BUTTON,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds(),
                Click.on(CarAndMiniCarPage.BUY_NOW_BUTTON),

                WaitUntil.the(CarAndMiniCarPage.WITHOUT_LOGIN_BUTTON_1,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds(),
                WaitUntil.the(CarAndMiniCarPage.WITHOUT_LOGIN_BUTTON_1,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CarAndMiniCarPage.WITHOUT_LOGIN_BUTTON_1),
                WaitUntil.the(CarAndMiniCarPage.WITHOUT_LOGIN_BUTTON_2,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                WaitUntil.the(CarAndMiniCarPage.WITHOUT_LOGIN_BUTTON_2,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CarAndMiniCarPage.WITHOUT_LOGIN_BUTTON_2)


        );
}

}
