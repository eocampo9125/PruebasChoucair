package com.choucair.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.choucair.steps",
        features = "src/test/resources/com/choucair/features/create.feature",
        snippets = SnippetType.CAMELCASE
)

public class Create {


}
