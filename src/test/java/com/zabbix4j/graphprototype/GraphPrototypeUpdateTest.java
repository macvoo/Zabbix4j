package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.graph.GraphItem;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
public class GraphPrototypeUpdateTest extends ZabbixApiTestBase {

    public GraphPrototypeUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        String expectedId = createDummy();

        GraphPrototypeUpdateRequest request = new GraphPrototypeUpdateRequest();
        GraphPrototypeUpdateRequest.Params params = request.getParams();
        params.setGraphid(expectedId);
        params.setName("Grpahprototype update success");
        params.setWidth(100);
        params.setHeight(800);

        GraphPrototypeUpdateResponse response = zabbixApi.graphPrototype().update(request);
        assertNotNull(response);

        deleteResult(expectedId);

        logger.debug(getGson().toJson(response));

        String actualId = response.getResult().getGraphids().get(0);
        assertThat(expectedId, is(expectedId));
    }

    private String createDummy() throws ZabbixApiException {

        GraphPrototypeCreateRequest request = new GraphPrototypeCreateRequest();
        GraphPrototypeCreateRequest.Params params = request.getParams();
        params.setName("Graphprototype update test");
        GraphItem gitem = new GraphItem();
        gitem.setColor("00AA00");
        gitem.setItemid("23730");
        params.addGraphItem(gitem);
        params.setHeight(140);
        params.setWidth(800);

        GraphPrototypeCreateResponse response = zabbixApi.graphPrototype().create(request);
        assertNotNull(response);

        return response.getResult().getGraphids().get(0).toString();
    }

    private void deleteResult(final String id) throws ZabbixApiException {

        GraphPrototypeDeleteRequest request = new GraphPrototypeDeleteRequest();
        request.addGraphPrototypeid(id);

        GraphPrototypeDeleteResponse response = zabbixApi.graphPrototype().delete(request);
    }
}
