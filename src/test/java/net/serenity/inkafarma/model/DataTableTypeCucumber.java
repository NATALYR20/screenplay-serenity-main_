package net.serenity.inkafarma.model;

import io.cucumber.java.DataTableType;
import net.serenity.inkafarma.model.Beans.*;

import java.util.Map;

public class DataTableTypeCucumber {

    @DataTableType
    public Credentials withUserAndPassword(Map<String, String> credentials) {
        return new Credentials(
                credentials.get("RedSocial"),
                credentials.get("Email"),
                credentials.get("Password")
        );
    }

    @DataTableType
    public  Skus WithListSkus (Map<String, String> Skus){
        return new Skus(
                Skus.get("sku"),
                Skus.get("presentation"),
                Skus.get("quantity")
        );
    }

    @DataTableType
    public  PaymentMethods WithDetailsCard (Map<String, String> PaymentMethods){
        return new PaymentMethods(
                PaymentMethods.get("cardNumber"),
                PaymentMethods.get("date"),
                PaymentMethods.get("cvv"),
                PaymentMethods.get("name"),
                PaymentMethods.get("lastName"),
                PaymentMethods.get("email")
        );
    }

    @DataTableType
    public  Anonymous WithDataUsers (Map<String, String> Anonymous){
        return new Anonymous(
                Anonymous.get("firstName"),
                Anonymous.get("lastName"),
                Anonymous.get("motherLastName"),
                Anonymous.get("typeDocument"),
                Anonymous.get("numberDocument"),
                Anonymous.get("cellPhone"),
                Anonymous.get("email")
        );
    }

}
