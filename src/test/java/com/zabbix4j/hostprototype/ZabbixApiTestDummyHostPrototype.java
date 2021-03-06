package com.zabbix4j.hostprototype;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import com.zabbix4j.lldrule.ZabbixApiTestDummyLLDRule;
import java.util.Random;

/**
 * @author Suguru Yajima
 */
public class ZabbixApiTestDummyHostPrototype extends ZabbixApiTestDummyMethodBase {
    private final String TEST_GROUP_ID = "20";
    private ZabbixApiTestDummyLLDRule dummyLLD;
    private String lldRuleID = "23796";

    public ZabbixApiTestDummyHostPrototype(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String createHost() throws ZabbixApiException {
        HostPrototypeCreateRequest request = new HostPrototypeCreateRequest();
        HostPrototypeCreateRequest.Params params = request.getParams();
        params.setRuleid(lldRuleID);
        GroupLinkObject linkObj = new GroupLinkObject();
        linkObj.setGroupid(TEST_GROUP_ID);
        params.addGroupLink(linkObj);

        GroupPrototypeObject typeObj = new GroupPrototypeObject();
        typeObj.setName("host prototype name" + new Random().nextInt());
        params.addGroupPrototype(typeObj);

        params.setHost("{#HV.NAME}");

        HostPrototypeCreateResponse response = zabbixApi.hostPrototype().create(request);

        return response.getResult().getHostids().get(0);
    }

    public void deleteHostPrototype(final String id) throws ZabbixApiException {
        if (id == null) {
            return;
        }
        HostPrototypeDeleteRequest request = new HostPrototypeDeleteRequest();
        request.addHostid(id);

        HostPrototypeDeleteResponse response = zabbixApi.hostPrototype().delete(request);
    }
}
