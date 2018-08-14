package com.zabbix4j.action;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/20.
 */
public class ActionGetTest extends ZabbixApiTestBase {

    private final String action_get_test1 = "action get test1";

    public ActionGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        DummyAction dummyAction = new DummyAction(zabbixApi);
        Integer actionId = dummyAction.create(action_get_test1);

        ActionGetRequest request = new ActionGetRequest();
        ActionGetRequest.Params params = request.getParams();
        params.addActionId(actionId);

        ActionGetResponse response = zabbixApi.action().get(request);
        assertNotNull(response);

        deleteDummy(actionId);

        ActionObject actionObject = response.getResult().get(0);

        assertEquals(action_get_test1, actionObject.getName());
        assertEquals("{TRIGGER.NAME}: {TRIGGER.STATUS}", actionObject.getDef_shortdata());
    }

    private void deleteDummy(Integer id) throws ZabbixApiException {

        ActionDeleteRequest request = new ActionDeleteRequest();
        request.addActionId(id);

        ActionDeleteResponse response = zabbixApi.action().delete(request);
    }
}
