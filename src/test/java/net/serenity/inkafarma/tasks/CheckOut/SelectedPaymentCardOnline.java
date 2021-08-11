package net.serenity.inkafarma.tasks.CheckOut;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class SelectedPaymentCardOnline implements Task {

    private final List<String> items;

    public SelectedPaymentCardOnline(List<String> items) {
        this.items = items;
    }

    public static Performable selectCardNameOnline(List<String> items) {
        return new SelectedPaymentCardOnline(items);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (items.get(0).toUpperCase().trim()){
            case "MASTERCARD":
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_MASTERCARD_ONLINE,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_MASTERCARD_ONLINE)

                );
                break;
            case "AMEX":
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_AMEX_ONLINE,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_AMEX_ONLINE)
                );
                break;
            case "DINERS":
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_DINERS_ONLINE,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_DINERS_ONLINE)
                );
                break;
            case "OH VISA":
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_OH_VISA_ONLINE,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_OH_VISA_ONLINE)
                );
                break;
            case "OH MASTERCARD":
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_OH_MASTERCARD_ONLINE,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_OH_MASTERCARD_ONLINE)
                );
                break;

            case "AGORA":
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_AGORA_ONLINE,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_AGORA_ONLINE)
                );
            case "INTERBANK VISA":
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_INTERBANK_VISA_ONLINE,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_INTERBANK_VISA_ONLINE)
                );
                break;
            case "INTERBANK MASTERCARD":
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_INTERBANK_MASTERCARD_ONLINE,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_INTERBANK_MASTERCARD_ONLINE)
                );
                break;
            case "INTERBANK AMEX":
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_INTERBANK_AMEX_ONLINE,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_INTERBANK_AMEX_ONLINE)
                );
                break;

        }
    }
}
