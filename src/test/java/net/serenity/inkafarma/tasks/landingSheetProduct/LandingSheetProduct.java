package net.serenity.inkafarma.tasks.landingSheetProduct;

import net.serenity.inkafarma.model.Beans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

public class LandingSheetProduct implements Task {

    private static List<Beans.Skus> Sku;

    public LandingSheetProduct(List<Beans.Skus> Sku) {
        LandingSheetProduct.Sku = Sku;
    }

    public static Performable withDetails(List<Beans.Skus> Sku) {
        return new LandingSheetProduct(Sku);
//        return instrumented(LandingSheetProduct.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LandingSheetProductPage.PRESENTATION_SELECTED,
                        WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds()
        );
        if (LandingSheetProductPage.NAME_PRODUCT.resolveFor(actor).isVisible()) {
            if (!Sku.get(0).sku().toUpperCase().trim().equals("CAJA")) {
                actor.attemptsTo(
                        Click.on(LandingSheetProductPage.PRESENTATION_SELECTED),
                        Click.on(LandingSheetProductPage.OPTION_PRESENTATION_1)
                );
            }
            int quantity = Integer.parseInt(Sku.get(0).quantity());
            if (quantity >= 1) {
                actor.attemptsTo(
                        Click.on(LandingSheetProductPage.ADD_PRODUCT_CART)
                );
                int i;
                for (i = 1; i < quantity; i++) {
                    if (LandingSheetProductPage.ADD_MORE_QUANTITY_MAX.resolveFor(actor).isEnabled()) {
                        actor.attemptsTo(
                                Click.on(LandingSheetProductPage.ADD_MORE_QUANTITY)
                        );
                    } else {
                        System.out.println("the maximum quantity of this product " + Sku.get(0).sku().toUpperCase().trim() + " is " + i);
                        i = quantity;
                    }
                }
            }
        } else
            System.out.println("This product is exhausted: " + Sku.get(0).sku().toUpperCase().trim());
    }
}