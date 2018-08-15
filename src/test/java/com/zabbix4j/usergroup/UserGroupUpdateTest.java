package com.zabbix4j.usergroup;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/15.
 */
public class UserGroupUpdateTest extends ZabbixApiTestBase {
    private String id;

    public UserGroupUpdateTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        id = createDummyGroup();
    }

    @After
    public void tearDown() throws Exception {
        deleteDummmyGroup(id);
    }

    @Test
    public void testUpdate1() throws Exception {

        UserGroupUpdateRequest request = new UserGroupUpdateRequest();
        UserGroupUpdateRequest.Params params = request.getParams();
        params.setUsrgrpid(id);
        params.setName("usergroup update success");
        params.setDebug_mode(ZabbixApiParamter.DEBUG_MODE.ENABLE.value);
        params.setGui_access(ZabbixApiParamter.GUI_ACCESS.USE_INTERNAL_AUTH.value);

        UserGroupUpdateResponse response = zabbixApi.usergroup().update(request);
        assertNotNull(response);

        String actualId = response.getResult().getUsrgrpids().get(0);

        assertEquals(id, actualId);
    }

    private String createDummyGroup() throws ZabbixApiException {

        UserGroupCreateRequest request = new UserGroupCreateRequest();
        UserGroupCreateRequest.Params params = request.getParams();
        params.setName("usergroup update test");
        params.addUserid("1");

        UserGroupCreateResponse response = zabbixApi.usergroup().create(request);

        return response.getResult().getUsrgrpids().get(0);
    }

    private void deleteDummmyGroup(final String id) throws ZabbixApiException {

        UserGroupDeleteRequest request = new UserGroupDeleteRequest();
        request.addParams(id);

        UserGroupDeleteResponse response = zabbixApi.usergroup().delete(request);
    }
}
