package com.sp.ipv;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        features = "src/test/resources",
        format = { "pretty", "html:target/cucumber", "json:target/cucumber.json"}
        )
public class IPVTest {
}
