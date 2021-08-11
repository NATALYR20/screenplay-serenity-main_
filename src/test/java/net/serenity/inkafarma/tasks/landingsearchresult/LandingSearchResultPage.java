package net.serenity.inkafarma.tasks.landingsearchresult;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LandingSearchResultPage {

    //region SEARCH PRODUCT OR BRAND
    public static Target SEARCH_FIELD = Target.the("search field")
            .locatedBy("#ctrl-product-searcher");
    public static Target MATCHES_RESULTS = Target.the("match results")
            .locatedBy(".show-all-responsive.ng-star-inserted");
    public static Target SEE_ALL_RESULTS_BUTTON = Target.the("button field")
            .locatedBy("//a[@class='heading text-support-two']");
    public static Target MINICART_BUTTON = Target.the("minicart button")
            .located(By.cssSelector(".col.cart-header.navigation-cart-animation span"));
    //endregion

    public static Target SORT_SELECTOR = Target.the("sort by")
            .located(By.cssSelector(".mat-select-trigger"));
    public static Target OPTIONS_SORT_SELECTOR = Target.the("options sort by")
            .locatedBy(".mat-select-panel.select-basic");
    public static Target MOUSE_ELEMENT = Target.the("mouse to a product card")
            .locatedBy("//body/fp-root[1]/fp-business[1]/div[1]/div[1]/fp-search-landing[1]/div[1]/fp-search-landing-desktop[1]/div[1]/div[3]/div[2]/fp-filtered-product-list[1]/div[1]/div[1]/fp-product-large[1]/div[1]");
    public static Target VER_MAS= Target.the("Ver más")
            .located(By.xpath("/html/body/fp-root/fp-business/div/div/fp-search-landing/div/fp-search-landing-desktop/div/div[3]/div[2]/fp-filtered-product-list/div/div[1]/fp-product-large/div/div/fp-link-button/fp-link/a"));
    public static Target PRODUCT_CARD = Target.the("enter the product card")
            .located(By.xpath("//*[@id='undefined']/button"));


    public static Target SORT_BY_NAME_A_Z = Target.the("sort by name A - Z")
            .locatedBy("//span[contains(text(),'Nombre A - Z')]");
    public static Target SORT_BY_NAME_Z_A = Target.the("sort by name Z - A")
            .locatedBy("//span[contains(text(),'Nombre Z - A')]");
    public static Target SORT_BY_PRICE_ME = Target.the("sort by Price (menor a mayor)")
            .locatedBy("//span[contains(text(),'Precio (menor a mayor)')]");
    public static Target SORT_BY_PRICE_MA = Target.the("sort by Price (mayor a menor)")
            .locatedBy("//span[contains(text(),'Precio (mayor a menor)')]");
    public static Target SORT_BY_RELEVANCE = Target.the("sort by relevance")
            .locatedBy("//span[contains(text(),'Relevancia')]");
}
