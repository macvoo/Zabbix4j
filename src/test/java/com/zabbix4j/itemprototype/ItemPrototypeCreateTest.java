package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.application.ApplicationCreateRequest;
import com.zabbix4j.application.ApplicationCreateResponse;
import com.zabbix4j.application.ApplicationDeleteRequest;
import com.zabbix4j.application.ApplicationDeleteResponse;
import com.zabbix4j.host.DummyHost;
import com.zabbix4j.lldrule.LLDRuleCreateRequest;
import com.zabbix4j.lldrule.LLDRuleCreateResponse;
import com.zabbix4j.lldrule.LLDRuleObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ItemPrototypeCreateTest extends ZabbixApiTestBase {
    private String applicationid;
    private String hostid;
    private DummyHost dummyHost;
    private String lldRuleid;

    public ItemPrototypeCreateTest() {
        super();
    }

    @After
    public void tearDown() throws Exception {
        new DummyHost(zabbixApi).deleteHost(hostid);
    }

    @Before
    public void setUp() throws Exception {
        dummyHost = new DummyHost(zabbixApi);
        hostid = dummyHost.createHost();
        lldRuleid = createLLDRule(hostid, dummyHost);
        applicationid = testApplication();
    }

    @Test
    public void testCreate1() throws Exception {
        testCreate1("23797");
    }

    public String testCreate1(final String lldRuleId) throws Exception {

        String hostInterfaceId = new DummyHost(zabbixApi).getHostInterface(hostid);

        ItemPrototypeCreateRequest request = new ItemPrototypeCreateRequest();
        ItemPrototypeCreateRequest.Params params = request.getParams();
        params.setName("Free disk space on $1");
        params.setRuleid(lldRuleId);
        params.addApplication(applicationid);
        params.setDelay("60s");
        params.setHostid(hostid);

        params.setKey_("vfs.fs.size[{#FSNAME},free]");
        params.setType(ItemPrototypeObject.ITEM_TYPE.SIMPLE_CHECK.value);
        params.setValue_type(ItemPrototypeObject.VALUE_TYPE.NUMERIC_UNSIGNED.value);

        params.setInterfaceid(hostInterfaceId);

        ItemPrototypeCreateResponse response = zabbixApi.itemPrototype().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        String actualId = response.getResult().getItemids().get(0);
        assertNotNull(actualId);
        return actualId.toString();
    }

    public String createLLDRule(final String targetHostId, final DummyHost dummyHost) throws Exception {

        String interfaceId = dummyHost.getHostInterface(targetHostId);

        LLDRuleCreateRequest request = new LLDRuleCreateRequest();
        LLDRuleCreateRequest.Params params = request.getParams();
        params.setDelay("30s");
        params.setHostid(targetHostId);
        params.setInterfaceid(interfaceId);
        params.setKey_("test");
        params.setName("LLD create");
        params.setType(LLDRuleObject.LLD_RULE_TYPE.SIMPLE_CHECK.value);

        LLDRuleCreateResponse response = zabbixApi.lldRule().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        return response.getResult().getItemids().get(0);
    }

    private String testApplication() throws Exception {

        ApplicationCreateRequest request = new ApplicationCreateRequest();
        ApplicationCreateRequest.Params params = request.getParams();
        params.setName("Application created");
        params.setHostid(hostid);

        ApplicationCreateResponse response = zabbixApi.application().create(request);
        assertNotNull(response);

        String id = response.getResult().getApplicationids().get(0);
        assertNotNull(id);
        return id;
    }

    private void delete(final String id) throws ZabbixApiException {

        ApplicationDeleteRequest request = new ApplicationDeleteRequest();
        request.addParams(id);

        ApplicationDeleteResponse response = zabbixApi.application().delete(request);
    }
}
