package steps;

import drivermanager.DynamicDriverManager;
import io.cucumber.java.en.And;

public class CommonSteps {
    public DynamicDriverManager driverManger;

    public CommonSteps(DynamicDriverManager driverManager){
        this.driverManger = driverManager;
    }

    @And("^I start the browser$")
    public void startBrowser() {
        driverManger.createDriver();
    }

}
