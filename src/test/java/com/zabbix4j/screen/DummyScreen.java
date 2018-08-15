package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyScreen extends ZabbixApiTestDummyMethodBase {
    public DummyScreen(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String create() throws ZabbixApiException {
        ScreenCreateRequest request = new ScreenCreateRequest();
        ScreenCreateRequest.Params params = request.getParams();
        params.setName("test.screen.create." + new Date().getTime());
        params.setHsize(3);
        params.setVsize(2);

        ScreenCreateResponse response = zabbixApi.screen().create(request);

        return response.getResult().getScreenids().get(0);
    }

    public void delete(String targetId) throws ZabbixApiException {

        ScreenDeleteRequest request = new ScreenDeleteRequest();
        request.addScreenid(targetId);

        ScreenDeleteResponse response = zabbixApi.screen().delete(request);
    }
}
