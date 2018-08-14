package com.zabbix4j.action;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/20.
 */
public class ActionUpdateTest extends ZabbixApiTestBase {

    public ActionUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        DummyAction dummyAction = new DummyAction(zabbixApi);
        Integer expectedId = dummyAction.create("action update test1");

        ActionUpdateRequest request = new ActionUpdateRequest();
        ActionUpdateRequest.Params params = request.getParams();
        params.setActionid(expectedId);
        params.setName("Action Updated");

        ActionUpdateResponse response = zabbixApi.action().update(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getActionids().get(0);

        deleteDummy(actualId);

        assertEquals(expectedId, actualId);
    }

    private void deleteDummy(Integer id) throws ZabbixApiException {

        ActionDeleteRequest request = new ActionDeleteRequest();
        request.addActionId(id);

        ActionDeleteResponse response = zabbixApi.action().delete(request);
    }
}
