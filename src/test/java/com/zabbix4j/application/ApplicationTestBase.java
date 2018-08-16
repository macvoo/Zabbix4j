package com.zabbix4j.application;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;

import static org.junit.Assert.assertNotNull;

public class ApplicationTestBase extends ZabbixApiTestBase {

    public String createDummy(final String name) throws ZabbixApiException {
        ApplicationCreateRequest request = new ApplicationCreateRequest();
        ApplicationCreateRequest.Params params = request.getParams();
        params.setName(name);
        params.setHostid("10084");

        ApplicationCreateResponse response = zabbixApi.application().create(request);
        assertNotNull(response);

        return response.getResult().getApplicationids().get(0);
    }

    public void delete(final String id) throws ZabbixApiException {

        ApplicationDeleteRequest request = new ApplicationDeleteRequest();
        request.addParams(id);

        ApplicationDeleteResponse response = zabbixApi.application().delete(request);
    }
}
