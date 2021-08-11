package net.serenity.inkafarma.tasks.landingSheetProduct;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LandingSheetProductPage {
    public static Target PRODUCT_SOLD_OUT= Target.the("text of product sold out")
            .locatedBy("//fp-product-detail-image-zoom[@class='image-zoom-desktop ng-star-inserted']//span[@class='tag-sold-out ng-star-inserted'][contains(text(),'AGOTADO')]");
    public static Target NAME_PRODUCT =Target.the("name product")
            .located(By.xpath("/html/body/fp-root/fp-business/div/div/fp-product-detail/fp-product-detail-desktop/section/div[1]/div/div[2]/div/div[1]/div[1]/fp-product-detail-information/div/div[2]"));
    public static Target PRESENTATION_SELECTED = Target.the("click on presentation")
            .located(By.xpath("//*[@id='btn--select-presentation']"));
    public static Target OPTION_PRESENTATION = Target.the("results of presentations")
            .locatedBy(".cdk-overlay-pane");
    public static Target OPTION_PRESENTATION_1 = Target.the("select a presentation 1")
            .locatedBy("//div[@class='mat-menu-content']//div[2]//span[1]");
    public static Target OPTION_PRESENTATION_2 = Target.the("select a presentation 2")
            .locatedBy("//div[@class='cdk-overlay-connected-position-bounding-box']//div[2]//span[1]");
    public static Target ADD_PRODUCT_CART = Target.the("add product to cart")
            .locatedBy("/html/body/fp-root/fp-business/div/div/fp-product-detail/fp-product-detail-desktop/section/div[1]/div/div[2]/div/div[5]/fp-product-detail-add-button/div/div/fp-button-primary/fp-button/a/button");
    // .locatedBy("//button[@class='btn btn-primary btn-spacer-large label-black-1 btn-block']");

    public static Target ADD_MORE_QUANTITY= Target.the("click on presentation")
            .locatedBy("#btn-plus-quantity");
    public static Target ADD_MORE_QUANTITY_MAX= Target.the("max quantity")
            .locatedBy("//fp-button[@id='btn-plus-quantity']//button[@class='btn btn-picker p-0 rounded-circle display-center h-100 w-100']");
    public static Target REMOVE_LESS_QUANTITY = Target.the("click on presentation")
            .locatedBy("#btn-minus-quantity");


}
