package com.zabbix4j.proxy;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ProxyDeleteTest extends ZabbixApiTestBase {
    public ProxyDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyProxy dummyProxy = new DummyProxy(zabbixApi);
        String targetId = dummyProxy.createWithoutHost();

        ProxyDeleteRequest request = new ProxyDeleteRequest();
        request.addProxyid(targetId);

        ProxyDeleteResponse response = zabbixApi.proxy().delete(request);
        assertNotNull(response);

        String actualId = response.getResult().getProxyids().get(0);
        assertThat(actualId, is(targetId));
    }
}
