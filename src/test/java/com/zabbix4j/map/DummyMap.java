package com.zabbix4j.map;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyMap extends ZabbixApiTestDummyMethodBase {

    public DummyMap(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String create() throws ZabbixApiException {

        MapCreateRequest request = new MapCreateRequest();
        MapCreateRequest.Params params = request.getParams();

        params.setName("test.map.create." + new Date().getTime());
        params.setWidth(600);
        params.setHeight(600);

        MapElementObject obj = new MapElementObject();
        obj.setElementid(10146);
        obj.setSelementid(1);
        obj.setElementtype(MapElementObject.ELEMENT_TYPE.HOST.value);
        obj.setIconid_off(2);
        params.addMapElement(obj);

        MapCreateResponse response = zabbixApi.map().create(request);

        return response.getResult().getSysmapids().get(0);
    }

    public void delete(String targetId) throws ZabbixApiException {

        MapDeleteRequest request = new MapDeleteRequest();
        request.addMapid(targetId);

        MapDeleteResponse response = zabbixApi.map().delete(request);
    }
}
