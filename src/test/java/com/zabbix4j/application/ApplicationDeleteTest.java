package com.zabbix4j.application;

import com.zabbix4j.ZabbixApiException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/23.
 */
public class ApplicationDeleteTest extends ApplicationTestBase {

    public ApplicationDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {

        Integer expect = createDummy();

        ApplicationDeleteRequest request = new ApplicationDeleteRequest();
        request.addParams(expect);

        ApplicationDeleteResponse response = zabbixApi.application().delete(request);
        assertNotNull(response);

        Integer actual = response.getResult().getApplicationids().get(0);
        assertEquals(expect, actual);
    }

    private String createDummy() throws ZabbixApiException {
        ApplicationCreateRequest request = new ApplicationCreateRequest();
        ApplicationCreateRequest.Params params = request.getParams();
        params.setName("Application before delete");
        params.setHostid(10084);

        ApplicationCreateResponse response = zabbixApi.application().create(request);
        assertNotNull(response);

        Integer id = response.getResult().getApplicationids().get(0);
        return id;
    }
}
