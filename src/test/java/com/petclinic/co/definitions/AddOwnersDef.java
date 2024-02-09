package com.petclinic.co.definitions;

import com.petclinic.co.steps.owners.AddOwnerStep;
import com.petclinic.co.steps.validations.ValidationStep;
import com.petclinic.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class AddOwnersDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    AddOwnerStep addOwner;

    @Steps(shared = true)
    ValidationStep validation;

    @Given("navegacion por el usuario al sitio web")
    public void userNavigateTo(){
        url.navigateTo("http://localhost:4200/petclinic/welcome");
    }

    @When("ingreso de todos los campos")
    public void addNewOwner(){
        addOwner.clickOwners();
        addOwner.clickAdd();
        addOwner.typeUsername("Ariana");
        addOwner.typeLastname("Garcia");
        addOwner.typeAddress("Carrera 12");
        addOwner.typeCity("Bogota");
        addOwner.typeTelephone("3142630987");
        addOwner.clickAddOwner();
    }

    @Then("la aplicacion guarda los datos y muestra el nombre de propietario en la lista")
    public void systemShowListOwnersModule(){
        Assert.assertTrue(validation.titleIsVisible());
    }

}
