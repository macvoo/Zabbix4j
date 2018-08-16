package com.zabbix4j.action;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.usergroup.UserGroupCreateRequest;
import com.zabbix4j.usergroup.UserGroupCreateResponse;
import com.zabbix4j.usergroup.UserGroupDeleteRequest;
import com.zabbix4j.usergroup.UserGroupDeleteResponse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/20.
 */
public class ActionGetTest extends ZabbixApiTestBase {
    private final String action_get_test1 = "action get test1";
    private String groupid;

    public ActionGetTest() {
        super();
    }

    @Before
    public void createDummyGroup() throws ZabbixApiException {

        UserGroupCreateRequest request = new UserGroupCreateRequest();
        UserGroupCreateRequest.Params params = request.getParams();
        params.setName("usergroup delete test");
        params.addUserid("1");

        UserGroupCreateResponse response = zabbixApi.usergroup().create(request);

        groupid = response.getResult().getUsrgrpids().get(0);
    }

    @After
    public void testDelete1() throws Exception {

        UserGroupDeleteRequest request = new UserGroupDeleteRequest();
        request.addParams(groupid);

        UserGroupDeleteResponse response = zabbixApi.usergroup().delete(request);

        assertNotNull(response);

        String actualId = response.getResult().getUsrgrpids().get(0);

        assertEquals(groupid, actualId);
    }

    @Test
    public void testGet1() throws Exception {

        DummyAction dummyAction = new DummyAction(zabbixApi);
        String actionId = dummyAction.create(action_get_test1, groupid);

        ActionGetRequest request = new ActionGetRequest();
        ActionGetRequest.Params params = request.getParams();
        params.addActionid(actionId);

        ActionGetResponse response = zabbixApi.action().get(request);
        assertNotNull(response);

        deleteDummy(actionId);

        ActionObject actionObject = response.getResult().get(0);

        assertEquals(action_get_test1, actionObject.getName());
        assertEquals("{TRIGGER.NAME}: {TRIGGER.STATUS}", actionObject.getDef_shortdata());
    }

    private void deleteDummy(final String id) throws ZabbixApiException {

        ActionDeleteRequest request = new ActionDeleteRequest();
        request.addActionid(id);

        ActionDeleteResponse response = zabbixApi.action().delete(request);
    }
}
