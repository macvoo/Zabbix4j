package com.zabbix4j.problem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiMethod;

public class Problem extends ZabbixApiMethod {

    public Problem(String apiUrl, String auth) {
        super(apiUrl, auth);
    }

    public ProblemGetResponse get(ProblemGetRequest request) throws ZabbixApiException {
        ProblemGetResponse response = null;
        request.setAuth(this.auth);
        Gson gson = (new GsonBuilder()).setPrettyPrinting().create();
        String requestJson = gson.toJson(request);

        try {
            String responseJson = this.sendRequest(requestJson);
            response = gson.fromJson(responseJson, ProblemGetResponse.class);
            return response;
        } catch (ZabbixApiException var6) {
            throw new ZabbixApiException(var6);
        }
    }
}
