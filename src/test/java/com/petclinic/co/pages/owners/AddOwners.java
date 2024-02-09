package com.petclinic.co.pages.owners;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddOwners extends PageObject {

    @FindBy(className = "dropdown-toggle")
    protected WebElementFacade dropDownOwner;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-plus']")
    protected WebElementFacade addOwner;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElementFacade subAddOwner;

    @FindBy(id="firstName")
    protected WebElementFacade txt_firstname;

    @FindBy(id="lastName")
    protected WebElementFacade txt_lastname;

    @FindBy(id="address")
    protected WebElementFacade txt_address;

    @FindBy(id="city")
    protected WebElementFacade txt_city;

    @FindBy(id="telephone")
    protected WebElementFacade txt_telephone;



}
