package com.petclinic.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {

   // @FindBy(xpath = "//a[@class='dropdown-toggle']")
//    protected WebElementFacade dd_owners;

    @FindBy(id = "ownersTable")
    protected WebElementFacade lbl_owners;
}
