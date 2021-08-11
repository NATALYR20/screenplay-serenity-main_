package net.serenity.inkafarma.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenity.inkafarma.model.Beans;
import net.serenity.inkafarma.tasks.CarAndMiniCar.CarAndMiniCar;
import net.serenity.inkafarma.tasks.CheckOut.CheckOutPage;
import net.serenity.inkafarma.tasks.CheckOut.DoCheckOut;
import net.serenity.inkafarma.tasks.landingsearchresult.SearchProduct;
import net.serenity.inkafarma.tasks.navigate.Navigate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Scroll;

import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;



import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;


public class PurchasesAnonymous {

    @Managed(driver = "chrome") //, options = "--headless")
    public WebDriver hisBrowser;

    @Given("{actor} is a non-loyal customer and needs to place an order")
    public void agent_is_a_non_loyal_customer_and_needs_to_place_an_order(Actor Alex) {
        givenThat(Alex.can(BrowseTheWeb.with(hisBrowser)));
        Alex.wasAbleTo(Navigate.toTheHomePage());
        BrowseTheWeb.as(Alex).waitFor(10).seconds();

    }
    @And("{actor} searches, adds his products and buys now")
    public void he_searches_adds_his_products_and_buys_now(Actor Alex, List<Beans.Skus> Sku) {
       Alex.attemptsTo(SearchProduct.byNameOrBrandOrSKUMap(Sku));
        BrowseTheWeb.as(Alex).waitFor(10).seconds();
       Alex.attemptsTo(CarAndMiniCar.IrToCart());
    }
    @And("{actor} enters his personal data")
    public void he_enters_his_personal_data(Actor Alex, List<Beans.Anonymous> DataAnonymous) {
        BrowseTheWeb.as(Alex).waitFor(10).seconds();
        Alex.attemptsTo(DoCheckOut.withDetailsUserDataAnoymous(DataAnonymous));
    }
    @And("{actor} enters his address {string} and type of delivery")
    public void he_enters_his_address_and_type_of_delivery(Actor Alex, String address) {
        Alex.attemptsTo(DoCheckOut.withSuggestedDirections(address));
        Alex.attemptsTo(DoCheckOut.continueWithSelectedAddress());
        BrowseTheWeb.as(Alex).waitFor(10).seconds();
    }
    @And("{actor} chooses a payment method {items}")
    public void he_chooses_a_payment_method_pos_visa(Actor Alex, List<String> TypePayment)  {
        Alex.attemptsTo(DoCheckOut.withSelectedPaymentMethod(TypePayment));
        BrowseTheWeb.as(Alex).waitFor(10).seconds();
    }
    @And("{actor} chooses an online payment card {items}")
    public void  he_chooses_an_online_payment_card(Actor Alex,List<String>TypeCard)  {
        Alex.attemptsTo(
                DoCheckOut.selectNameCardOnline(TypeCard)
        );
        BrowseTheWeb.as(Alex).waitFor(10).seconds();

    }
    @When("{actor} finalizes his purchase accepting the terms and conditions")
    public void he_finalizes_his_purchase_accepting_the_terms_and_conditions(Actor Alex) {
         Alex.attemptsTo(
                Scroll.to(CheckOutPage.SELECT_TERNS_COND),
                 WaitUntil.the(CheckOutPage.SELECT_TERNS_COND,isVisible()),
                 DoCheckOut.Finalizepurchase()
                 );
        BrowseTheWeb.as(Alex).waitFor(10).seconds();
    }

    @And("{actor} records his card details")
    public void he_records_his_card_details(Actor Alex, List<Beans.PaymentMethods>DetailsCard)  {
        theActorInTheSpotlight().wasAbleTo(
                DoCheckOut.termsAndConditions(),
                DoCheckOut.registerVisaCard(DetailsCard)
        );
        BrowseTheWeb.as(Alex).waitFor(10).seconds();

    }


    @Then("{actor} should see the following message:")
    public void he_should_see_the_following_message(Actor Alex,String MensajeEsperado) {
        Alex.should(seeThat(DoCheckOut.displayed(), equalTo(MensajeEsperado)));
        Alex.attemptsTo(DoCheckOut.ClickOKPopUp());
    }

}
