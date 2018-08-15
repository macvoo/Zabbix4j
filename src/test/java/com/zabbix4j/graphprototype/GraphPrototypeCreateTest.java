package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.graph.GraphItem;
import com.zabbix4j.itemprototype.ItemPrototypeCreateTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
public class GraphPrototypeCreateTest extends ZabbixApiTestBase {
    private ItemPrototypeCreateTest itemPrototypeCreateTest;
    private int itemPrototypeId;

    public GraphPrototypeCreateTest() {
        super();
    }

    @After
    public void tearDown() throws Exception {
        new ZabbixApiTestDummyLLDRule(zabbixApi).deleteLLDRule(lldRuleid);
        new DummyHost(zabbixApi).deleteHost(targetHostid);
        itemPrototypeCreateTest.tearDown();
    }

    @Before
    public void setUp() throws Exception {
        lldRuleid = createLLDRule();
        itemPrototypeid = createItemPrototype();
    }

    private String createLLDRule() throws ZabbixApiException {

        DummyHost dummyHost = new DummyHost(zabbixApi);
        targetHostid = dummyHost.createHost();
        String interfaceId = dummyHost.getHostInterface(targetHostid);

        LLDRuleCreateRequest request = new LLDRuleCreateRequest();
        LLDRuleCreateRequest.Params params = request.getParams();
        params.setDelay("30s");
        params.setHostid(targetHostid);
        params.setInterfaceid(interfaceId);
        params.setKey_("test");
        params.setName("LLD create");
        params.setType(LLDRuleObject.LLD_RULE_TYPE.SIMPLE_CHECK.value);

        LLDRuleCreateResponse response = zabbixApi.lldRule().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        String lldRuleid = response.getResult().getItemids().get(0);
        assertNotNull(lldRuleid);

        return lldRuleid.toString();
    }

    @Test
    public void testCreate1() throws Exception {
        GraphPrototypeCreateRequest request = new GraphPrototypeCreateRequest();
        GraphPrototypeCreateRequest.Params params = request.getParams();
        params.setName("Graphprototype create test");
        GraphItem gitem = new GraphItem();
        gitem.setColor("00AA00");
        gitem.setItemid(itemPrototypeid);
        params.addGraphItem(gitem);
        params.setHeight(140);
        params.setWidth(800);

        GraphPrototypeCreateResponse response = zabbixApi.graphPrototype().create(request);
        assertNotNull(response);

        String id = response.getResult().getGraphids().get(0);
        assertNotNull(id);
    }

    private String createItemPrototype() {
        String itemPrototypeid = "-1";
        itemPrototypeCreateTest = new ItemPrototypeCreateTest();
        try {
            itemPrototypeCreateTest.setUp();
            itemPrototypeId = itemPrototypeCreateTest.testCreate1();
        } catch (Exception e) {
            fail();
        }
        return itemPrototypeid;
    }

    private void deleteResult(final String id) throws ZabbixApiException {

        GraphPrototypeDeleteRequest request = new GraphPrototypeDeleteRequest();
        request.addParam(id);

        GraphPrototypeDeleteResponse response = zabbixApi.graphPrototype().delete(request);
    }
}
