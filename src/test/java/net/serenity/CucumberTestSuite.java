package net.serenity;

import io.cucumber.junit.CucumberOptions;
import net.serenity.browserstackserenity.BrowserStackSerenityTest;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        publish = true,
        plugin = {"pretty"},
        features = "src/test/resources/features/8._Purchases/purchases_anonymous.feature",
        tags = "@purchasePaymentPos"
)
public class CucumberTestSuite extends BrowserStackSerenityTest {

}
