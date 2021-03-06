package com.example.smartpot.requests;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.example.smartpot.enums.ServerURL;

import java.util.HashMap;
import java.util.Map;

public class PotCodeRequest extends StringRequest {

    final static private String  URL = ServerURL.URL.getUrl() + "/PotCodeValidate.php";
    private Map<String, String> parameters;

    public PotCodeRequest(String potCode, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("potCode", potCode);
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
