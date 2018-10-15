package com.sp.ipv;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class IPSteps {

    private final String IPVANISH_PATH = "/Applications/IPVanish VPN.app";
    private final String CONN_BUTTON = "src/test/resources/images/connect_button.png";
    private final String WHAT_IS_MYIP = "http://bot.whatismyipaddress.com";
    private Screen screen;
    private String myIpAddress;

    public IPSteps() {
        screen = new Screen();
    }

    @Before
    public void setUp() {
        myIpAddress = getMyIP();
        System.out.println("ip address: " + myIpAddress);
    }

    @Given("^IPV is accessible$")
    public void ipvIsAccessible() {
        try {
            Desktop.getDesktop().open(new File(IPVANISH_PATH));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @When("^I attemp to connection$")
    public void iAttempToConnection() throws FindFailed {
        takeANap();
        screen.click(CONN_BUTTON);
        takeANap();
    }

    @Then("^I should successfully connect$")
    public void iShouldSuccessfullyConnect() throws Throwable {
        Assert.assertNotEquals("ip address must differ after connection",
                myIpAddress, getMyIP());
    }

    private String getMyIP() {
        URL url = null;
        String myIP = "";
        try {
            url = new URL(WHAT_IS_MYIP);
            BufferedReader streamReader =
                    new BufferedReader(new InputStreamReader(url.openStream()));
            myIP = streamReader.readLine().trim();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myIP;
    }

    public void takeANap() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
