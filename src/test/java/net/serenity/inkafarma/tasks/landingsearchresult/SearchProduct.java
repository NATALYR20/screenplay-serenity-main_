package net.serenity.inkafarma.tasks.landingsearchresult;


import net.serenity.inkafarma.model.Beans;
import net.serenity.inkafarma.tasks.landingSheetProduct.LandingSheetProduct;
import net.serenity.inkafarma.tasks.login.LoginForm;
import net.serenity.inkafarma.tasks.navigate.Alerts;
import net.serenity.inkafarma.tasks.navigate.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchProduct {

    public static Performable byNameOrBrandOrSKU(String productNameOrBrand) {
        return Task.where("{0} Search product by name or brand",
                Enter.theValue(productNameOrBrand).into(LandingSearchResultPage.SEARCH_FIELD),
                WaitUntil.the(LandingSearchResultPage.SEE_ALL_RESULTS_BUTTON,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds()
                        .then(Hit.the(Keys.ENTER).into(LandingSearchResultPage.SEE_ALL_RESULTS_BUTTON))
        );
    }

    public static Performable byNameOrBrandOrSKUMap(List<Beans.Skus> Sku)  {
        return Task.where("{0} Search product by name or brand",
                WaitUntil.the(LandingSearchResultPage.SEARCH_FIELD, isVisible()).forNoMoreThan(10).seconds(),
                 Enter.theValue(Sku.get(0).sku()).into(LandingSearchResultPage.SEARCH_FIELD),
                WaitUntil.the(LandingSearchResultPage.SEE_ALL_RESULTS_BUTTON,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds()
                        .then(Hit.the(Keys.ENTER).into(LandingSearchResultPage.SEE_ALL_RESULTS_BUTTON)),
                LandingSearchResults.withDetails(),
                LandingSheetProduct.withDetails(Sku)
        );
    }


}
