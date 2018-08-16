package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import com.zabbix4j.hostinteface.HostInterfaceGetRequest;
import com.zabbix4j.hostinteface.HostInterfaceGetResponse;
import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ZabbixApiTestDummyLLDRule extends ZabbixApiTestDummyMethodBase {

    private String hostId = "10141";

    public ZabbixApiTestDummyLLDRule(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String createLLDRule() throws ZabbixApiException {
        Integer targetHostId = null;

        String interfaceId = getHostInterface(hostId);

        LLDRuleCreateRequest request = new LLDRuleCreateRequest();
        LLDRuleCreateRequest.Params params = request.getParams();
        params.setDelay("30s");
        params.setHostid(hostId);
        params.setInterfaceid(interfaceId);
        params.setKey_("test");
        params.setName("LLD create");
        params.setType(LLDRuleObject.LLD_RULE_TYPE.SIMPLE_CHECK.value);

        LLDRuleCreateResponse response = zabbixApi.lldRule().create(request);
        assertNotNull(response);

        return response.getResult().getItemids().get(0);
    }

    public String getHostInterface(final String id) throws ZabbixApiException {

        HostInterfaceGetRequest request = new HostInterfaceGetRequest();
        HostInterfaceGetRequest.Params params = request.getParams();
        ArrayList<String> hostids = new ArrayList<String>();
        hostids.add(id);
        params.setHostids(hostids);

        HostInterfaceGetResponse response = zabbixApi.hostInterface().get(request);

        return response.getResult().get(0).getInterfaceid();
    }

    public void deleteLLDRule(final String id) throws ZabbixApiException {

        LLDRuleDeleteRequest request = new LLDRuleDeleteRequest();
        request.addRuleid(id);

        LLDRuleDeleteResponse response = zabbixApi.lldRule().delete(request);
    }
}
