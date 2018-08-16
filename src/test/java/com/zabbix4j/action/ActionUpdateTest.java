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
public class ActionUpdateTest extends ZabbixApiTestBase {

    private String groupid;

    public ActionUpdateTest() {
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
    public void testUpdate1() throws Exception {

        DummyAction dummyAction = new DummyAction(zabbixApi);
        String expectedId = dummyAction.create("action update test1", groupid);

        ActionUpdateRequest request = new ActionUpdateRequest();
        ActionUpdateRequest.Params params = request.getParams();
        params.setActionid(expectedId);
        params.setName("Action Updated");

        ActionUpdateResponse response = zabbixApi.action().update(request);
        assertNotNull(response);

        String actualId = response.getResult().getActionids().get(0);

        deleteDummy(actualId);

        assertEquals(expectedId, actualId);
    }

    private void deleteDummy(final String id) throws ZabbixApiException {

        ActionDeleteRequest request = new ActionDeleteRequest();
        request.addActionid(id);

        ActionDeleteResponse response = zabbixApi.action().delete(request);
    }
}
