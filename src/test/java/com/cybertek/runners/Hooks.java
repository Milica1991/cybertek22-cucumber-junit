package com.cybertek.runners;

import com.cybertek.utilities.Driver;
import org.junit.Before;
import org.junit.After;

public class Hooks {

    //Import from io.cucumber.java not from junit
    @Before
    public void setupScenario(){
        System.out.println("--Setting up browser with further details...");
    }

    @After
    public void tearDownScenario(){
        System.out.println("--Teardown steps are being applied...");
        Driver.closeDriver();
    }
}
