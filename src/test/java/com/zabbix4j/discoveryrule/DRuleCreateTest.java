package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/26.
 */
public class DRuleCreateTest extends ZabbixApiTestBase {

    private Integer druleId;

    public DRuleCreateTest() {
        super();
    }

    @After
    public void tearDown() throws Exception {
        DRuleDeleteRequest request = new DRuleDeleteRequest();
        request.addDRuleId(druleId);

        DRuleDeleteResponse response = zabbixApi.discoveryRule().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        Integer acutalId = response.getResult().getDruleids().get(0);

        assertEquals(druleId, acutalId);
    }

    @Test
    public void testCreate1() throws Exception {

        DRuleCreateRequest request = new DRuleCreateRequest();
        DRuleCreateRequest.Params params = request.getParams();
        params.setIprange("127.0.0.1");
        params.setName("dicovery test at localhost3");

        DCheck dcheck = new DCheck();
        dcheck.setKey_("key_");
        dcheck.setPorts(10050);
        dcheck.setType(9);
        dcheck.setUniq(0);
        params.addCheck(dcheck);

        DRuleCreateResponse response = zabbixApi.discoveryRule().create(request);
        druleId = response.getResult().getDruleids().get(0);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));
    }
}
