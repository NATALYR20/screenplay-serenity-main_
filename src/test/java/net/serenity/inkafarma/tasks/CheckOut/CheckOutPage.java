package net.serenity.inkafarma.tasks.CheckOut;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOutPage {

    //RegionDataUserAnonymous
    public static Target ANONYMOUS_NAME_FIELD = Target.the("full name anonymous")
            .locatedBy("#ctrl--name-anonymous");
    public static Target ANONYMOUS_FATHER_LASTNAME_FIELD = Target.the("full name anonymous")
            .locatedBy("#ctrl--fatherLastName-anonymous");
    public static Target ANONYMOUS_MOTHER_LASTNAME_FIELD = Target.the("full name anonymous")
            .locatedBy("#ctrl--motherLastName-anonymous");
    public static Target ANONYMOUS_SELECTED_TYPE_DOCUMENT = Target.the("dni anonymous")
            .locatedBy(".col-12.col-lg-3 .custom-options-container");
    public static Target ANONYMOUS_SELECTED_TYPE_DOCUMENT_1 = Target.the("DNI")
            .locatedBy("//option[contains(text(),'DNI')]");
    public static Target ANONYMOUS_SELECTED_TYPE_DOCUMENT_2 = Target.the("C.E")
            .locatedBy("//option[contains(text(),'C.E.')]");
    public static Target ANONYMOUS_SELECTED_TYPE_DOCUMENT_3 = Target.the("PASSPORT")
            .locatedBy("//option[contains(text(),'Pasaporte')]");
    public static Target ANONYMOUS_DNI_FIELD = Target.the("dni anonymous")
            .locatedBy("#ctrl--document-anonymous");
    public static Target ANONYMOUS_PHONE_FIELD = Target.the("phone anonymous")
            .locatedBy("#ctrl--phone-anonymous");
    public static Target ANONYMOUS_EMAIL_FIELD = Target.the("email anonymous")
            .locatedBy("#ctrl--email-anonymous");
    //EndRegion

    //RegionAddress
    public static Target ADD_ADDRESS_BUTTON = Target.the("click on address")
            .locatedBy("#link--add-address");
    public static Target ENTER_ADDRESS_FIELD = Target.the("enter address")
            .locatedBy("#ctrl--address");
    public static Target AUTOCOMPLETE_ADDRESS_FIELD = Target.the("autocomplete address").
            locatedBy(".search-autocomplete-list.card");
    public static Target REFERENCE_ADDRESS_FIELD = Target.the("reference address")
            .locatedBy("#ctrl--address-reference");
    public static Target OTHER_OPTION_ADDRESS = Target.the("other address favorite")
            .located(By.xpath("//*[@id='core-new-address-modal']/fp-sub-section-container/div/div[4]/div[2]/div[3]/fp-border-container/div/fp-radio-address-nickname/div"));
    public static Target NAME_FAVORITE_ADDRESS_FIELD = Target.the("name favorite address")
            .locatedBy("#ctrl--address-other");
    //TODO change this selector for an id
    public static Target VENTANA=Target.the("Ventana")
            .locatedBy("div.cdk-overlay-container:nth-child(31) div.cdk-global-overlay-wrapper div.cdk-overlay-pane.custom-full-x-modal-overlay mat-dialog-container.mat-dialog-container.ng-tns-c70-17.ng-trigger.ng-trigger-dialogContainer.ng-star-inserted:nth-child(2) fp-new-address-modal.ng-star-inserted div.new-address-modal.scrollbar.ng-touched.ng-dirty.ng-valid fp-sub-section-container:nth-child(3) > div.sub-section-container");
    public static Target SAVE_ADDRESS = Target.the("save address")
            .located(By.xpath("(//*[@id='btn--save-new-address'])[1]"));
    public static Target SELECTED_RET = Target.the("selected RET")
            .locatedBy("/html/body/fp-root/fp-checkout/div/fp-checkout-desktop/div/div[3]/div/div[1]/fp-checkout-main-content/fp-checkout-type-of-delivery-form/fp-section-container/div/form/fp-sub-section-container[2]/div/div[2]/div/div[1]/fp-radio-control/div/label/span");
    //EndRegion

    //RegionHorarios
    public static Target SELECT_DELIVERY_DAY = Target.the("select delivery day")
            .locatedBy("//select[@id='deliveryDay']");
    public static Target SELECT_DAY = Target.the("select a day")
            .locatedBy("//select[@id='deliveryDay']//option[1]");
    public static Target SELECT_DELIVERY_HOUR = Target.the("select delivery hour")
            .locatedBy("//select[@id='deliveryTime']");
    public static Target SELECT_HOUR = Target.the("select a hour")
            .locatedBy("#deliveryTime > option:nth-child(1)");
//            .locatedBy("//select[@id='deliveryTime']//option[1]");
     //Endregion

    //RegionComprobantePago
    public static Target SELECT_FACTURE = Target.the("select facture")
            .locatedBy("//span[@class='slider round']");
    public static Target ENTER_RUC_FIELD = Target.the("select delivery day")
            .locatedBy("//input[@id='enterRUC']");
    public static Target ENTER_RAZON_SOCIAL_FIELD = Target.the("select delivery day")
            .locatedBy("//input[@id='enterRazonSocial']");
    public static Target ENTER_RUC_ADDRESS = Target.the("select delivery day")
            .locatedBy("//input[@id='enterDomicilioLegal']");
    //EndRegion

    //PAYMETENT METHODE
    public static Target SELECT_CONTRAENTREGA_POS = Target.the("select contraentrega POS")
            .locatedBy("//div[contains(text(),'Pago con POS contra entrega')]");
    // .locatedBy("//body/fp-root/fp-checkout/div[@class='checkout']/fp-checkout-desktop/div[@class='checkout-desktop']/div[@class='container checkout-full-content']/div[@class='row']/div[@class='col-xl-7 col-xxl-8 checkout-sections']/fp-checkout-main-content/fp-checkout-payment-method/div[@class='checkout-payment-method']/fp-section-container/div[@class='card']/fp-sub-section-container/div[@class='sub-section-container']/div[@class='content mb-3 ng-untouched ng-pristine ng-invalid']/fp-select-payment-radio-button[2]/div[1]/fp-border-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fp-radio-control[1]/div[1]/label[1]/span[1]");
    public static Target SELECT_PAY_ONLINE = Target.the("select pay online")
            .locatedBy("//div[contains(text(),'Pago en línea')]");
    public static Target SELECT_CONTRAENTREGA_CASH = Target.the("select contraentrega cash")
            .locatedBy("//div[contains(text(),'Pago en efectivo contra entrega')]");
    public static Target ENTER_CASH = Target.the("select delivery day")
            .locatedBy("//input[@id='cashPayment']");
    //EndRegion

    //PAYMENT CARD -PAY ONLINE PAYMENT METHOD
    public static Target  SELECT_VISA_ONLINE=Target.the("VISA CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[1]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[1]");
    public static Target  SELECT_MASTERCARD_ONLINE=Target.the("MARTERCARD CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[1]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[2]");
    public static Target  SELECT_AMEX_ONLINE=Target.the("AMEX CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[1]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[3]");
    public static Target  SELECT_DINERS_ONLINE=Target.the("DINERS CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[1]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[4]");
    public static Target  SELECT_OH_VISA_ONLINE=Target.the("OH VISA CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[1]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[5]");
    public static Target  SELECT_OH_MASTERCARD_ONLINE=Target.the("OH MASTERCARD CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[1]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[6]");
    public static Target  SELECT_AGORA_ONLINE=Target.the("AGORA CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[1]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[7]");
    public static Target  SELECT_INTERBANK_VISA_ONLINE=Target.the("INTERBAK VISA CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[1]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[8]");
    public static Target  SELECT_INTERBANK_MASTERCARD_ONLINE=Target.the("INTERBANK MASTERCARD CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[1]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[9]");
    public static Target  SELECT_INTERBANK_AMEX_ONLINE=Target.the("INTERBANK AMEX CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[1]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[10]");
    //EndRegion


    //PAYMENT CARD -POS PAYMENT METHOD
    public static Target  SELECT_VISA=Target.the("VISA CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[2]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[1]");
    public static Target  SELECT_MASTERCARD=Target.the("MARTERCARD CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[2]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[2]");
    public static Target  SELECT_AMEX=Target.the("AMEX CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[2]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[3]");
    public static Target  SELECT_DINERS=Target.the("DINERS CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[2]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[4]");
    public static Target  SELECT_OH_VISA=Target.the("OH VISA CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[2]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[5]");
    public static Target  SELECT_OH_MASTERCARD=Target.the("OH MASTERCARD CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[2]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[6]");
    //   public static Target  SELECT_AGORA=Target.the("AGORA CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[2]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[7]");
    public static Target  SELECT_INTERBANK_VISA=Target.the("INTERBAK VISA CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[2]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[7]");
    public static Target  SELECT_INTERBANK_MASTERCARD=Target.the("INTERBANK MASTERCARD CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[2]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[8]");
    public static Target  SELECT_INTERBANK_AMEX=Target.the("INTERBANK AMEX CARD").locatedBy("//body/fp-root[1]/fp-checkout[1]/div[1]/fp-checkout-desktop[1]/div[1]/div[3]/div[1]/div[1]/fp-checkout-main-content[1]/fp-checkout-payment-method[1]/div[1]/fp-section-container[1]/div[1]/fp-sub-section-container[1]/div[1]/div[2]/fp-select-payment-radio-button[2]/div[1]/fp-border-container[1]/div[1]/div[1]/div[2]/div[1]/fp-payment-card-radio-button[9]");
    //EndRegion

    public static Target SELECT_INKACLUB = Target.the("select inkaclub")
            .locatedBy(".checkout-terms .check-mark");
    public static Target SELECT_TERNS_COND = Target.the("select terms and conditions")
            .locatedBy("//div[1]/div/fp-checkbox-control/div/label/span");
    public static Target SELECT_DATA_TREATMENT = Target.the("select data treatment")
            .locatedBy("//div[2]/div/fp-checkbox-control/div/label/span");

    public static Target FINALIZE_PURCHASE = Target.the("finalize purchase")
            .locatedBy("//button[contains(text(),'Finalizar compra')]");

//            .locatedBy("//button[@class='btn btn-primary btn-spacer-regular label-black btn-block']");

    public static Target INPUT_CASH_AMOUNT=Target.the("cash amount")
            .locatedBy("//input[@id='ctrl--cash-amount']");

    //RegionModalRegistrarTARJETAVISA
    public static Target VISA_MODAL_CHECK_BOX_TERNS_COND=Target.the("select check termns and conditions")
            .locatedBy("//label[contains(.,'Acepto los términos y condiciones de pago')]");
    public static  Target VISA_MODAL_BTN_PAY=Target.the("modal btn pay")
            .located(By.xpath("//button[contains(text(),'PAGAR')]"));

    public static Target VISA_INPUT_CARD_NUMBER=Target.the("input card number")
            .located(By.id("number"));

    public static Target VISA_INPUT_EXPIRE=Target.the("input expire card number")
            .located(By.id("expiry"));

    public static Target VISA_INPUT_CVV=Target.the("input cvv card number")
            .located(By.id("cvc"));
    public static Target VISA_INPUT_NAME=Target.the("input name")
            .located(By.id("name"));
    public static Target VISA_INPUT_LAST_NAME=Target.the("input  last name")
            .located(By.id("lastname"));
    public static Target VISA_INPUT_EMAIL=Target.the("input email")
            .located(By.id("email"));
    public static Target VISA_BTN_PAY=Target.the("btn pay")
            .located(By.xpath("/html/body/div[1]/form/div[1]/div[11]/button[1]"));
    //Endregion

}
