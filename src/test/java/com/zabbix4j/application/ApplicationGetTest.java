package com.zabbix4j.application;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

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

        ArrayList<String> ids = new ArrayList<String>();
        ids.add(createDummy("Application get delete"));
        ids.add(createDummy("Application get delete2"));

        String hostId = "10084";
        ApplicationGetRequest request = new ApplicationGetRequest();
        ApplicationGetRequest.Params params = request.getParams();
        params.addHostid(hostId);

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
