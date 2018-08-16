package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.graph.GraphItem;
import com.zabbix4j.itemprototype.DummyItemPrototype;
import org.hamcrest.core.Is;
import org.junit.After;
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

    @After
    public void tearDown() throws Exception {
        dummyItemPrototype.delete(itemPrototype);
    }

    @Test
    public void testDelete1() throws Exception {
        dummyItemPrototype = new DummyItemPrototype(zabbixApi);
        itemPrototype = dummyItemPrototype.createItemPrototype();
        String targetId = createDummy();

        GraphPrototypeDeleteRequest request = new GraphPrototypeDeleteRequest();
        request.addGraphPrototypeid(targetId);

        GraphPrototypeDeleteResponse response = zabbixApi.graphPrototype().delete(request);
        assertNotNull(response);

        String actualId = response.getResult().getGraphids().get(0).toString();
        assertThat(targetId, Is.is(actualId));
    }

    private String createDummy() throws ZabbixApiException {

        GraphPrototypeCreateRequest request = new GraphPrototypeCreateRequest();
        GraphPrototypeCreateRequest.Params params = request.getParams();
        params.setName("Graphprototype delete test");
        GraphItem gitem = new GraphItem();
        gitem.setColor("C80000");
        gitem.setItemid("26832");
        params.addGraphItem(gitem);
        params.setHeight(140);
        params.setWidth(800);

        GraphPrototypeCreateResponse response = zabbixApi.graphPrototype().create(request);
        assertNotNull(response);

        return response.getResult().getGraphids().get(0).toString();
    }
}
