package net.serenity.inkafarma.tasks.landingsearchresult;

import net.serenity.inkafarma.tasks.navigate.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LandingSearchResults {
    public static Performable withDetails() {
        return Task.where("{0} sort by relevance",
                WaitUntil.the(LandingSearchResultPage.SORT_SELECTOR,
                        WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LandingSearchResultPage.SORT_SELECTOR),
                WaitUntil.the(LandingSearchResultPage.OPTIONS_SORT_SELECTOR,
                        WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                OrderProduct.withDetails("Relevancia"),
//                SelectFromOptions.byVisibleText("Relevancia").from(SearchResultsLanding.OPTIONS_SORT_SELECTOR),
                MoveMouse.to(LandingSearchResultPage.MOUSE_ELEMENT),
                WaitUntil.the(LandingSearchResultPage.MOUSE_ELEMENT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LandingSearchResultPage.VER_MAS)
        );
    }


}