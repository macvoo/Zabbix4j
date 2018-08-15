package com.zabbix4j.discoveryrule;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/26.
 */
public class DRuleDeleteTest extends ZabbixApiTestBase {

    public DRuleDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {
        String druleId = createDummy();

        DRuleDeleteRequest request = new DRuleDeleteRequest();
        request.addDRuleid(druleId);

        DRuleDeleteResponse response = zabbixApi.discoveryRule().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        String acutalId = response.getResult().getDruleids().get(0);

        assertEquals(druleId, acutalId);
    }

    private String createDummy() throws ZabbixApiException {

        DRuleCreateRequest request = new DRuleCreateRequest();
        DRuleCreateRequest.Params params = request.getParams();
        params.setIprange("127.0.0.1");
        params.setName("dicovery test at localhost");

        DCheck dcheck = new DCheck();
        dcheck.setKey_("key_");
        dcheck.setPorts(10050);
        dcheck.setType(9);
        dcheck.setUniq(0);
        params.addCheck(dcheck);

        DRuleCreateResponse response = zabbixApi.discoveryRule().create(request);

        return response.getResult().getDruleids().get(0);
    }
}
