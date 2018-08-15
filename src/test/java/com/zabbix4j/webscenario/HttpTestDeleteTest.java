package com.zabbix4j.webscenario;

import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class HttpTestDeleteTest extends ZabbixApiTestBase {
    public HttpTestDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyWebScenario dummyWebScenario = new DummyWebScenario(zabbixApi);
        String targetId = dummyWebScenario.create();

        HttpTestDeleteRequest request = new HttpTestDeleteRequest();
        request.addHttpTestid(targetId);

        HttpTestDeleteResponse response = zabbixApi.webscenario().delete(request);
        assertNotNull(response);

        String actualId = response.getResult().getHttptestids().get(0).toString();
        assertThat(actualId, Is.is(targetId));
    }
}
