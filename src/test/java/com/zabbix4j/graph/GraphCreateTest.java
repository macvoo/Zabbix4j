package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiTestBase;
import java.util.UUID;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/29.
 */
public class GraphCreateTest extends ZabbixApiTestBase {
    private String graphid;

    public GraphCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        GraphCreateRequest request = new GraphCreateRequest();
        GraphCreateRequest.Params params = request.getParams();
        params.setName("Graph Create Test" + UUID.randomUUID());

        GraphItem gitem = new GraphItem();
        gitem.setItemid("23661");
        gitem.setColor("00AA00");
        params.addGraphItem(gitem);

        params.setHeight(800);
        params.setWidth(140);

        GraphCreateResponse response = zabbixApi.graph().create(request);
        assertNotNull(response);
        graphid = response.getResult().getGraphids().get(0).toString();
    }

    @After
    public void tearDown() throws Exception {

        GraphDeleteRequest request = new GraphDeleteRequest();
        request.getParams().add(graphid);

        GraphDeleteResponse response = zabbixApi.graph().delete(request);
        assertNotNull(response);

        assertEquals(graphid, response.getResult().getGraphids().get(0).toString());
    }
}
