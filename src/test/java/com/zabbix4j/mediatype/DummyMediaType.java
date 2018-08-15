package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyMediaType extends ZabbixApiTestDummyMethodBase {

    public DummyMediaType(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String create() throws ZabbixApiException {

        MediaTypeCreateRequest request = new MediaTypeCreateRequest();

        MediaTypeObject obj = new MediaTypeObject();
        obj.setDescription("test.mediatype." + new Date());
        obj.setType(MediaTypeObject.MEDIA_TYPE.EMAIL.value);
        obj.setSmtp_server("rootmail@company.com");
        obj.setSmtp_helo("company.com");
        obj.setSmtp_email("zabbix@company.com");
        request.addMediaType(obj);

        MediaTypeCreateResponse response = zabbixApi.mediaType().create(request);

        return response.getResult().getMediatypeids().get(0);
    }

    public void delete(String targetId) throws ZabbixApiException {

        MediaTypeDeleteRequest request = new MediaTypeDeleteRequest();
        request.addMediaTypeid(targetId);

        MediaTypeDeleteResponse response = zabbixApi.mediaType().delete(request);
    }
}
