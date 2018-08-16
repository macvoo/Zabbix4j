package com.zabbix4j.proxy;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyProxy extends ZabbixApiTestDummyMethodBase {
    public DummyProxy(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String create() throws ZabbixApiException {
        final String hostId = "10147";

        ProxyCreateRequest request = new ProxyCreateRequest();
        ProxyCreateRequest.Params params = request.getParams();
        params.setHost("test.proxy.create." + new Date().getTime());
        params.setStatus(ProxyObject.STATUS.ACTIVE_PROXY.value);
        params.addHostid(hostId);

        ProxyCreateResponse response = zabbixApi.proxy().create(request);

        return response.getResult().getProxyids().get(0);
    }

    public String createWithoutHost() throws ZabbixApiException {
        final Integer hostId = 10147;

        ProxyCreateRequest request = new ProxyCreateRequest();
        ProxyCreateRequest.Params params = request.getParams();
        params.setHost("test.proxy.create." + new Date().getTime());
        params.setStatus(ProxyObject.STATUS.ACTIVE_PROXY.value);
        //params.addHostid(hostId);

        ProxyCreateResponse response = zabbixApi.proxy().create(request);

        return response.getResult().getProxyids().get(0);
    }

    public void delete(String targetId) throws ZabbixApiException {

        ProxyDeleteRequest request = new ProxyDeleteRequest();
        request.addProxyid(targetId);

        ProxyDeleteResponse response = zabbixApi.proxy().delete(request);
    }
}
