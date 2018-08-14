package com.zabbix4j.application;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/22.
 */
public class ApplicationCreateTest extends ApplicationTestBase {

    public ApplicationCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {

        ApplicationCreateRequest request = new ApplicationCreateRequest();
        ApplicationCreateRequest.Params params = request.getParams();
        params.setName("Application created");
        params.setHostid(10084);

        ApplicationCreateResponse response = zabbixApi.application().create(request);
        assertNotNull(response);

        Integer id = response.getResult().getApplicationids().get(0);
        assertNotNull(id);

        delete(id);
    }
}
