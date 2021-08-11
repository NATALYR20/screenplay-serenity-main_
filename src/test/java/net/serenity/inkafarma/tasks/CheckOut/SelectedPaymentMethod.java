package net.serenity.inkafarma.tasks.CheckOut;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class SelectedPaymentMethod implements Task {
    private final List<String> items;

    public SelectedPaymentMethod(List<String> items) {
        this.items = items;
    }

    public static Performable withDetails(List<String> items) {
        return new SelectedPaymentMethod(items);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (items.get(0).toUpperCase().trim()) {
            case "PAYONLINE":
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_CONTRAENTREGA_POS,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_CONTRAENTREGA_POS),
                        WaitUntil.the(CheckOutPage.SELECT_PAY_ONLINE,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_PAY_ONLINE)
//                        CardList.valueOf("VISA").getDescripcion()
                );
                break;
            case "POS":
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_CONTRAENTREGA_POS,
                                WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_CONTRAENTREGA_POS)
                );
                break;
            default:
                actor.attemptsTo(
                        WaitUntil.the(CheckOutPage.SELECT_CONTRAENTREGA_CASH, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(CheckOutPage.SELECT_CONTRAENTREGA_CASH),
                        Enter.theValue(items.get(0)).into(CheckOutPage.ENTER_CASH)
                );
                break;
        }
    }

    public static Performable paymentCash(String mount) {
        return Task.where("{0} check payment cash",
                WaitUntil.the(CheckOutPage.SELECT_CONTRAENTREGA_CASH, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CheckOutPage.SELECT_CONTRAENTREGA_CASH),
                Enter.theValue(mount).into(CheckOutPage.INPUT_CASH_AMOUNT)
        );
    }
}
