package com.zabbix4j.hostinterface;

import com.google.gson.Gson;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.hostinteface.HostInterfaceGetRequest;
import com.zabbix4j.hostinteface.HostInterfaceGetResponse;
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/08.
 */
public class HostInterfaceGetTest extends ZabbixApiTestBase {

    public HostInterfaceGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        HostInterfaceGetRequest request = new HostInterfaceGetRequest();
        HostInterfaceGetRequest.Params params = request.getParams();
        ArrayList<String> hostids = new ArrayList<String>();
        hostids.add("10084");
        params.setHostids(hostids);

        HostInterfaceGetResponse response = zabbixApi.hostInterface().get(request);

        assertNotNull(response);

        Gson gson = getGson();
        logger.debug(gson.toJson(response));
    }
}
