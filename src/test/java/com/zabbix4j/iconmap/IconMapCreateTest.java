package com.zabbix4j.iconmap;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class IconMapCreateTest extends ZabbixApiTestBase {
    private String createdid;

    public IconMapCreateTest() {
        super();
    }

    @After
    public void tearDown() throws Exception {
        IconMapDeleteRequest request = new IconMapDeleteRequest();
        request.addIconMapid(createdid);

        IconMapDeleteResponse response = zabbixApi.iconMap().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        String actualId = response.getResult().getIconmapids().get(0);
        assertThat(createdid, Is.is(actualId));
    }

    @Test
    public void testCreate1() throws Exception {

        IconMapCreateRequest request = new IconMapCreateRequest();
        IconMapCreateRequest.Params params = request.getParams();
        params.setName("Type icons");
        params.setDefault_iconid(2);

        IconMappingObject obj = new IconMappingObject();
        obj.setInventory_link(1);
        obj.setExpression("server");
        obj.setIconid("3");

        params.addMapping(obj);

        IconMapCreateResponse response = zabbixApi.iconMap().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        createdid = response.getResult().getIconmapids().get(0);
        assertNotNull(createdid);
    }
}
