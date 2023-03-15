package api;

import utils.PropertiesUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ApiHeaders extends ApiUtils{
    PropertiesUtils propertiesUtils = new PropertiesUtils();

    Map<String, String> headers = new HashMap<>();

    public Map<String, String> gorestHeaders(String token) throws IOException {
        headers.put("Accept","applicationJson");
        headers.put("Content-Type","applicationJson");
//        headers.put("Authorization",token);
         headers.put("Authorization", PropertiesUtils.getProp("token_gorest"));
        return headers;
    }
}
