package com.zabbix4j.webscenario;

import com.zabbix4j.ZabbixApiTestBase;
import java.util.Date;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class HttpTestCreateTest extends ZabbixApiTestBase {

    public HttpTestCreateTest() {
        super();
    }

    @Test
    public void testCreate() throws Exception {
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
        assertNotNull(response);

        String actualId = response.getResult().getHttptestids().get(0);
        assertNotNull(actualId);
    }
}
