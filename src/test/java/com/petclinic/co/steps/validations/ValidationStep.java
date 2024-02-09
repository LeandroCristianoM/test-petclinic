package com.petclinic.co.steps.validations;

import com.petclinic.co.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Validar tabla de propietarios")
    public Boolean titleIsVisible(){
        return lbl_owners.isDisplayed();
    }
}
