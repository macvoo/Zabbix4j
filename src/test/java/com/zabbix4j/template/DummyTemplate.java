package com.zabbix4j.template;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyTemplate extends ZabbixApiTestDummyMethodBase {
    public DummyTemplate(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String create() throws ZabbixApiException {

        final String groupId = "25";
        final String hostId = "10084";

        TemplateCreateRequest request = new TemplateCreateRequest();
        TemplateCreateRequest.Params params = request.getParams();
        params.setHost("test.template.create." + new Date().getTime());
        params.addGroupid(groupId);
        params.addHostid(hostId);

        TemplateCreateResponse response = zabbixApi.template().create(request);

        return response.getResult().getTemplateids().get(0);
    }

    public void delete(String targetId) throws ZabbixApiException {

        TemplateDeleteRequest request = new TemplateDeleteRequest();
        request.addTemplateid(targetId);

        TemplateDeleteResponse response = zabbixApi.template().delete(request);
    }
}
