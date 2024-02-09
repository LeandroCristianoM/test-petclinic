package com.petclinic.co.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {

    @Steps(shared = true)
    PageObject petclinic;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        petclinic.setDefaultBaseUrl(url);
        petclinic.open();
    }

}
