package com.zabbix4j.map;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class MapDeleteTest extends ZabbixApiTestBase {

    public MapDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {
        DummyMap dummyMap = new DummyMap(zabbixApi);
        String targetId = dummyMap.create();

        MapDeleteRequest request = new MapDeleteRequest();
        request.addMapid(targetId);

        MapDeleteResponse response = zabbixApi.map().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        String actualId = response.getResult().getSysmapids().get(0);
        assertThat(actualId, is(targetId));
    }
}
