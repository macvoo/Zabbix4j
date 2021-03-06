package com.zabbix4j.host;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import com.zabbix4j.hostinteface.HostInterfaceGetRequest;
import com.zabbix4j.hostinteface.HostInterfaceGetResponse;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.template.TemplateObject;
import com.zabbix4j.usermacro.Macro;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Suguru Yajima
 */
public class DummyHost extends ZabbixApiTestDummyMethodBase {

    public DummyHost(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String createHost() throws ZabbixApiException {
        HostCreateRequest request = new HostCreateRequest();
        HostCreateRequest.Params params = request.getParams();

        List<TemplateObject> templates = new ArrayList<TemplateObject>();
        templates.add(new TemplateObject().setTemplateid("10093"));
        templates.add(new TemplateObject().setTemplateid("10094"));
        templates.add(new TemplateObject().setTemplateid("10095"));
        params.setTemplates(templates);

        params.addGroupid("12");

        List<Macro> macros = new ArrayList<Macro>();
        Macro macro1 = new Macro();
        macro1.setMacro("{$MACRO1}");
        macro1.setValue("value1");
        macros.add(macro1);
        params.setMacros(macros);

        List<HostInterfaceObject> interfaces = new ArrayList<HostInterfaceObject>();
        HostInterfaceObject hostInterface = new HostInterfaceObject();
        hostInterface.setIp("192.168.255.255");
        interfaces.add(hostInterface);
        params.setInterfaces(interfaces);

        params.setHost("dummy host");
        params.setName("dymmy host name");

        HostCreateResponse response = zabbixApi.host().create(request);

        return response.getResult().getHostids().get(0).toString();
    }

    public void deleteHost(final String id) throws ZabbixApiException {

        HostDeleteRequest request = new HostDeleteRequest();
        request.addHostid(id);

        HostDeleteResponse response = zabbixApi.host().delete(request);
    }

    public String getHostInterface(String hostId) throws ZabbixApiException {

        HostInterfaceGetRequest request = new HostInterfaceGetRequest();
        HostInterfaceGetRequest.Params params = request.getParams();
        ArrayList<String> hostids = new ArrayList<String>();
        hostids.add(hostId);
        params.setHostids(hostids);

        HostInterfaceGetResponse response = zabbixApi.hostInterface().get(request);

        return response.getResult().get(0).getInterfaceid();
    }

    public HostObject getHost() throws ZabbixApiException {

        HostGetRequest request = new HostGetRequest();
        HostGetRequest.Params params = request.getParams();

        ArrayList<String> hostIds = new ArrayList<String>();
        hostIds.add("10108");
        params.setHostids(hostIds);

        params.setSelectDiscoveryRule(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectGroups(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectItems(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectApplications(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectDiscoveries(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectGraphs(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectHostDiscovery(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectHttpTests(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectInterfaces(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectInventory(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectMacros(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectParentTemplates(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectScreens(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectTriggers(ZabbixApiParamter.QUERY.extend.name());

        HostGetResponse response = zabbixApi.host().get(request);

        return response.getResult().get(0);
    }
}
