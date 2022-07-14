package steps;

import api.ApiUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ScenariosUtils;

import java.util.HashMap;

public class Hooks extends ApiUtils {
    @Before
    public void before(Scenario scenario){
        ScenariosUtils.add(scenario);

        headers=new HashMap<>();
        params=new HashMap<>();

    }
    @After
    public void after(){
        ScenariosUtils.remove();
    }
}
