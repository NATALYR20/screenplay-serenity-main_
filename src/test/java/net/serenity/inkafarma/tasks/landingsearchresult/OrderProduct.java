package net.serenity.inkafarma.tasks.landingsearchresult;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OrderProduct implements Task {

    private final String name;

    public OrderProduct(String name) {
        this.name = name;
    }

    public static Performable withDetails(String name) {
        return instrumented(OrderProduct.class,name);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (name) {
            case "Nombre A - Z":
                actor.attemptsTo(Click.on(LandingSearchResultPage.SORT_BY_NAME_A_Z));
                break;
            case "Nombre Z - A":
                actor.attemptsTo(Click.on(LandingSearchResultPage.SORT_BY_NAME_Z_A));
                break;
            case "Precio (menor a mayor)":
                actor.attemptsTo(Click.on(LandingSearchResultPage.SORT_BY_PRICE_MA));
                break;
            case "Precio (mayor a menor)":
                actor.attemptsTo(Click.on(LandingSearchResultPage.SORT_BY_PRICE_ME));
                break;
            default:
                actor.attemptsTo(Click.on(LandingSearchResultPage.SORT_BY_RELEVANCE));
                break;
        }
    }
}
