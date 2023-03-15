package steps;

import api.ApiHeaders;
import api.ApiRequest;
import com.github.javafaker.Faker;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.json.JSONException;
import utils.JsonUtils;
import utils.PropertiesUtils;

import java.io.IOException;

public class GorestSteps extends ApiRequest {
    PropertiesUtils prop = new PropertiesUtils();
    JsonUtils jsonUtils = new JsonUtils();
    ApiHeaders apiHeaders = new ApiHeaders();
    Faker faker = new Faker();


    @Dado("que possuo gorest token valido")
    public void que_possuo_gorest_token_valido() throws IOException {
        token= PropertiesUtils.getProp("token_gorest");
//          System.out.println(prop.getProp("token_gorest")); // para lê a variavel token e imprimir no console

    }
    @Quando("envio um request de cadastro de usuario com dados validos")
    public void envio_um_request_de_cadastro_de_usuario_com_dados_validos() throws JSONException, IOException {
        String uri = prop.getProp("uri_gorest");
//        String uri = prop.getProp("token_gorest");
        headers = apiHeaders.gorestHeaders(token);
        body = jsonUtils.parseJSonFile();
        body.put("email", faker.internet().emailAddress());
        super.POST();
//        System.out.println(body);

    }

    @Entao("o usuario deve ser criado corretamente")
    public void o_usuario_deve_ser_criado_corretamente() {
//        // Write code here that turns the phrase above into concrete actions

//        throw new io.cucumber.java.PendingException();
    }

    @E("o status code do request deve ser {int}")
    public void o_status_code_do_request_deve_ser(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

}
