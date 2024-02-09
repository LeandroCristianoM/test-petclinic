package com.petclinic.co.steps.owners;

import com.petclinic.co.pages.owners.AddOwners;
import net.thucydides.core.annotations.Step;

public class AddOwnerStep extends AddOwners {

    @Step("Click dropdown Owners")
    public void clickOwners (){
        dropDownOwner.click();
    }

    @Step("add owner")
    public void clickAdd(){
        addOwner.click();
    }

    @Step("Ingresar nombre")
    public void typeUsername (String username){
        txt_firstname.sendKeys(username);
    }

    @Step("Ingresar apellido")
    public void typeLastname (String lastname){
        txt_lastname.sendKeys(lastname);
    }

    @Step("Ingresar direccion")
    public void typeAddress (String address){
        txt_address.sendKeys(address);
    }

    @Step("Ingresar ciudad")
    public void typeCity (String city){
        txt_city.sendKeys(city);
    }

    @Step("Ingresar telefono")
    public void typeTelephone (String telephone){
        txt_telephone.sendKeys(telephone);
    }

    @Step("add owner to list")
    public void clickAddOwner(){
        subAddOwner.click();
    }

}
