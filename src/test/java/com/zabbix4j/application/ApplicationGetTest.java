package com.zabbix4j.application;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Suguru Yajima on 2014/05/24.
 */
public class ApplicationGetTest extends ApplicationTestBase {

    public ApplicationGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {

        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(createDummy("Application get delete"));
        ids.add(createDummy("Application get delete2"));

        Integer hostId = 10084;
        ApplicationGetRequest request = new ApplicationGetRequest();
        ApplicationGetRequest.Params params = request.getParams();
        params.addHostId(hostId);

        ApplicationGetResponse response = zabbixApi.application().get(request);
        assertNotNull(response);

        delete(ids.get(0));
        delete(ids.get(1));

        List<ApplicationGetResponse.Result> resultList = response.getResult();

        assertTrue(!resultList.isEmpty());
        for (int i = 0; i < resultList.size(); i++) {
            ApplicationGetResponse.Result result = resultList.get(i);

            assertNotNull(result);
            assertEquals(hostId, result.getHostid());
        }
    }
}
