package net.serenity.inkafarma.tasks.CheckOut;

import com.google.common.base.Joiner;
import lombok.SneakyThrows;
import net.serenity.inkafarma.model.Beans;
import net.serenity.inkafarma.tasks.navigate.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import javax.xml.crypto.Data;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DoCheckOut {
    public static Performable withDetailsUserDataAnoymous(List<Beans.Anonymous> DataAnonymous) {
        return Task.where("{0} enters his personal data " + Joiner.on(", ").join(DataAnonymous),

                WaitUntil.the(CheckOutPage.ANONYMOUS_NAME_FIELD,
                        WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(DataAnonymous.get(0).firstName()).into(CheckOutPage.ANONYMOUS_NAME_FIELD).thenHit(Keys.TAB),
                Enter.theValue(DataAnonymous.get(0).lastName()).into(CheckOutPage.ANONYMOUS_FATHER_LASTNAME_FIELD).thenHit(Keys.TAB),
                Enter.theValue(DataAnonymous.get(0).motherLastName()).into(CheckOutPage.ANONYMOUS_MOTHER_LASTNAME_FIELD).thenHit(Keys.TAB),
                Click.on(CheckOutPage.ANONYMOUS_SELECTED_TYPE_DOCUMENT),
                SelectFromOptions.byVisibleText(DataAnonymous.get(0).typeDocument()).from(CheckOutPage.ANONYMOUS_SELECTED_TYPE_DOCUMENT),
                Enter.theValue(DataAnonymous.get(0).numberDocument()).into(CheckOutPage.ANONYMOUS_DNI_FIELD).thenHit(Keys.TAB),
                Enter.theValue(DataAnonymous.get(0).cellPhone()).into(CheckOutPage.ANONYMOUS_PHONE_FIELD).thenHit(Keys.TAB),
                Enter.theValue(DataAnonymous.get(0).email()).into(CheckOutPage.ANONYMOUS_EMAIL_FIELD).thenHit(Keys.TAB)
                // Click.on(Checkout.SELECT_INKACLUB)
        );
    }


    public static Performable withSuggestedDirections(String address) {
        return Task.where("{0} starts with a todo list containing ",
                Click.on(CheckOutPage.ADD_ADDRESS_BUTTON),
                Enter.theValue(address).into(CheckOutPage.ENTER_ADDRESS_FIELD).thenHit(Keys.ENTER)
        );
    }

    public static Performable continueWithSelectedAddress() {

        return Task.where("{0} click on autocomplete address",
                WaitUntil.the(CheckOutPage.AUTOCOMPLETE_ADDRESS_FIELD,
                        WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckOutPage.AUTOCOMPLETE_ADDRESS_FIELD),
                Enter.theValue("depart de alex piso 10").into(CheckOutPage.REFERENCE_ADDRESS_FIELD),
                //Click.on(CheckOutPage.OTHER_OPTION_ADDRESS),
               // Enter.theValue("alex depart gg").into(CheckOutPage.NAME_FAVORITE_ADDRESS_FIELD),
               // Scroll.to(CheckOutPage.SAVE_ADDRESS),
                WaitUntil.the(CheckOutPage.SAVE_ADDRESS,
                        WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds(),
                Click.on(CheckOutPage.SAVE_ADDRESS)
        );
    }

    public static Performable withSelectedPaymentMethod(List<String> items) {
        return Task.where("{0} selected payment methods",
                SelectedPaymentMethod.withDetails(items)
        );
    }

    public static Performable selectNameCardOnline(List<String> items) {

        return Task.where("{0} selected name card",
                SelectedPaymentCardOnline.selectCardNameOnline(items)
        );
    }


    public static Performable Finalizepurchase(){

        return Task.where("{0} check on terms and conditions",

                Click.on(CheckOutPage.SELECT_TERNS_COND),
                Click.on(CheckOutPage.SELECT_DATA_TREATMENT),
                Click.on(CheckOutPage.FINALIZE_PURCHASE)
        );
    }

    public static Performable ClickOKPopUp() {
//        String txt = Home.POPUP_AFTER_PURCHASE.resolveFor(actor).getTextContent();
//        System.out.println("el texto es: "+txt);
        return Task.where("{0} check on terms and conditions",
                Click.on(HomePage.BUTTON_OK_AFTER_PURCHASE)
        );
    }

    public static Question<String> displayed()  {

        return Text.of(HomePage.POPUP_AFTER_PURCHASE).asAString();
    }

    //public static Performable purchases() throws InterruptedException {
     //   Sleep.By(1);
      //  Scroll.Scrolling.By(0,10000);
      //  return Task.where("{0} check on terms and conditions",
              //  Click.on(CheckOutPage.FINALIZE_PURCHASE)
       // );
    //}

    public static Performable termsAndConditions(){
        return Task.where("accept the termsn and conditions",

                //  WaitUntil.the(Checkout.FINALIZE_PURCHASE,isVisible()).forNoMoreThan(10).seconds(),
                // Scroll.to(Checkout.FINALIZE_PURCHASE),
                //  Click.on(Checkout.FINALIZE_PURCHASE),
                Switch.toFrame("iframeProcesa"),
                WaitUntil.the(CheckOutPage.VISA_MODAL_CHECK_BOX_TERNS_COND,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckOutPage.VISA_MODAL_CHECK_BOX_TERNS_COND),
                WaitUntil.the(CheckOutPage.VISA_MODAL_BTN_PAY,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckOutPage.VISA_MODAL_BTN_PAY)
        );

    }
    public static Performable registerVisaCard (List<Beans.PaymentMethods>DetailsCard)  {
        //,String expire,String cvv,String name,String lastName,String email
        return Task.where("register visa card",
               /*
                WaitUntil.the(Checkout.FINALIZE_PURCHASE,isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(Checkout.FINALIZE_PURCHASE),
                Click.on(Checkout.FINALIZE_PURCHASE),
                Switch.toFrame("iframeProcesa"),
               WaitUntil.the(Checkout.VISA_MODAL_CHECK_BOX_TERNS_COND,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Checkout.VISA_MODAL_CHECK_BOX_TERNS_COND),
               WaitUntil.the(Checkout.VISA_MODAL_BTN_PAY,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Checkout.VISA_MODAL_BTN_PAY),
             */
                //   Sleep.By(30),
                Switch.toFrame("visaNetJS"),
                //  Sleep.By(20),
                //  WaitUntil.the(Checkout.VISA_INPUT_CARD_NUMBER,isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(CheckOutPage.VISA_INPUT_CARD_NUMBER,isVisible()).forNoMoreThan(20).seconds(),
                Enter.keyValues(DetailsCard.get(0).cardNumber()).into(CheckOutPage.VISA_INPUT_CARD_NUMBER),

                WaitUntil.the(CheckOutPage.VISA_INPUT_CVV,isVisible()).forNoMoreThan(10).seconds(),
                Enter.keyValues(DetailsCard.get(0).date()).into(CheckOutPage.VISA_INPUT_EXPIRE),
                WaitUntil.the(CheckOutPage.VISA_INPUT_CVV,isVisible()).forNoMoreThan(20).seconds(),
                Enter.keyValues(DetailsCard.get(0).cvv()).into(CheckOutPage.VISA_INPUT_CVV),
                WaitUntil.the(CheckOutPage.VISA_INPUT_NAME,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(DetailsCard.get(0).name()).into(CheckOutPage.VISA_INPUT_NAME),
                WaitUntil.the(CheckOutPage.VISA_INPUT_LAST_NAME,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(DetailsCard.get(0).lastName()).into(CheckOutPage.VISA_INPUT_LAST_NAME),
                WaitUntil.the(CheckOutPage.VISA_INPUT_EMAIL,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(DetailsCard.get(0).email()).into(CheckOutPage.VISA_INPUT_EMAIL),
                WaitUntil.the(CheckOutPage.VISA_BTN_PAY,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckOutPage.VISA_BTN_PAY)
                /*
                WaitUntil.the(Checkout.VISA_INPUT_EXPIRE,isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(Checkout.VISA_INPUT_EXPIRE,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(expire).into(Checkout.VISA_INPUT_EXPIRE),
                WaitUntil.the(Checkout.VISA_INPUT_CVV,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(cvv).into(Checkout.VISA_INPUT_CVV),
                WaitUntil.the(Checkout.VISA_INPUT_NAME,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(name).into(Checkout.VISA_INPUT_NAME),
                WaitUntil.the(Checkout.VISA_INPUT_LAST_NAME,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(lastName).into(Checkout.VISA_INPUT_LAST_NAME),
                WaitUntil.the(Checkout.VISA_INPUT_EMAIL,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(email).into(Checkout.VISA_INPUT_EMAIL),
                WaitUntil.the(Checkout.VISA_BTN_PAY,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Checkout.VISA_BTN_PAY)

*/

        );
    }
}
