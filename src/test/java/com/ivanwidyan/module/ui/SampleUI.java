package com.ivanwidyan.module.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class SampleUI extends PageObject {

  public void openHomePage() {
    openUrl("https://www.google.com/");
  }

  public void doSearch(){
    openUrl("https://google.com/search?q=ivanwidyan");
  }
}