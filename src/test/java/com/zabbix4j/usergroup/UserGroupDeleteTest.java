package com.zabbix4j.usergroup;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/15.
 */
public class UserGroupDeleteTest extends ZabbixApiTestBase {

    public UserGroupDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        String expectedId = createDummyGroup();

        UserGroupDeleteRequest request = new UserGroupDeleteRequest();
        request.addParams(expectedId);

        UserGroupDeleteResponse response = zabbixApi.usergroup().delete(request);

        assertNotNull(response);

        String actualId = response.getResult().getUsrgrpids().get(0);

        assertEquals(expectedId, actualId);
    }

    private String createDummyGroup() throws ZabbixApiException {

        UserGroupCreateRequest request = new UserGroupCreateRequest();
        UserGroupCreateRequest.Params params = request.getParams();
        params.setName("usergroup delete test");
        params.addUserid("1");

        UserGroupCreateResponse response = zabbixApi.usergroup().create(request);

        return response.getResult().getUsrgrpids().get(0);
    }
}
