package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.graph.GraphItem;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
public class GraphPrototypeDeleteTest extends ZabbixApiTestBase {
    private String itemPrototype;
    private DummyItemPrototype dummyItemPrototype;

    public GraphPrototypeDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        Integer targetId = createDummy();

        GraphPrototypeDeleteRequest request = new GraphPrototypeDeleteRequest();
        request.addParam(targetId);

        GraphPrototypeDeleteResponse response = zabbixApi.graphPrototype().delete(request);
        assertNotNull(response);

        Integer actualId = response.getResult().getGraphids().get(0);
        assertThat(targetId, Is.is(actualId));
    }

    private String createDummy() throws ZabbixApiException {

        GraphPrototypeCreateRequest request = new GraphPrototypeCreateRequest();
        GraphPrototypeCreateRequest.Params params = request.getParams();
        params.setName("Graphprototype delete test");
        GraphItem gitem = new GraphItem();
        gitem.setColor("C80000");
        gitem.setItemid(26832);
        params.addGraphItem(gitem);
        params.setHeight(140);
        params.setWidth(800);

        GraphPrototypeCreateResponse response = zabbixApi.graphPrototype().create(request);
        assertNotNull(response);

        Integer id = response.getResult().getGraphids().get(0);

        return id;
    }
}
