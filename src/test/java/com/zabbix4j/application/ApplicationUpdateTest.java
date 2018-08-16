package com.zabbix4j.application;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/23.
 */
public class ApplicationUpdateTest extends ApplicationTestBase {

    public ApplicationUpdateTest() {
        super();
    }

    @Test
    public void testUpdate() throws Exception {

        String expected = createDummy("Application before update");

        ApplicationUpdateRequest request = new ApplicationUpdateRequest();
        ApplicationUpdateRequest.Params params = request.getParams();
        params.setApplicationid(expected);
        params.setName("Applicaton updated");

        ApplicationUpdateResponse response = zabbixApi.application().update(request);
        assertNotNull(response);

        String actual = response.getResult().getApplicationids().get(0).toString();

        delete(actual);

        assertEquals(expected, actual);
    }
}
