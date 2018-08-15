package com.zabbix4j.proxy;

import com.zabbix4j.ZabbixApiTestBase;
import java.util.Date;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ProxyCreateTest extends ZabbixApiTestBase {

    public ProxyCreateTest() {
        super();
    }

    @Test
    public void testCreate() throws Exception {
        final String hostId = "10147";

        ProxyCreateRequest request = new ProxyCreateRequest();
        ProxyCreateRequest.Params params = request.getParams();
        params.setHost("test.proxy.create." + new Date().getTime());
        params.setStatus(ProxyObject.STATUS.ACTIVE_PROXY.value);
        params.addHostid(hostId);

        ProxyCreateResponse response = zabbixApi.proxy().create(request);
        assertNotNull(response);

        String actualId = response.getResult().getProxyids().get(0);
        assertNotNull(actualId);
    }
}
