package hooks;

import base.BaseSteps;
import io.cucumber.java.Before;
import io.cucumber.java.After;


public class Hooks extends BaseSteps {

    @Before
    public void setUp() {
        initializeDriver(); // Launches browser
        System.out.println("Browser launched");
    }

    @After
    public void tearDown() {
        quitDriver(); // Closes browser
        System.out.println("Browser closed");
    }
}
