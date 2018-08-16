package com.zabbix4j.webscenario;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyWebScenario extends ZabbixApiTestDummyMethodBase {
    public DummyWebScenario(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String create() throws ZabbixApiException {
        final String hostId = "10084";

        HttpTestCreateRequest request = new HttpTestCreateRequest();
        HttpTestCreateRequest.Params params = request.getParams();

        params.setName("httptest.create." + new Date().getTime());
        params.setHostid(hostId);

        ScenarioStepObject obj = new ScenarioStepObject();
        obj.setName("Homepage");
        obj.setUrl("http://mycompany.com");
        obj.setStatus_codes("200");
        obj.setNo(1);
        params.addScenarioStepObject(obj);

        HttpTestCreateResponse response = zabbixApi.webscenario().create(request);

        return response.getResult().getHttptestids().get(0).toString();
    }

    public void delete(String targetId) throws ZabbixApiException {

        HttpTestDeleteRequest request = new HttpTestDeleteRequest();
        request.addHttpTestid(targetId);

        HttpTestDeleteResponse response = zabbixApi.webscenario().delete(request);
    }
}
