package com.zabbix4j.item;

import com.google.gson.Gson;
import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Suguru Yajima on 2014/05/07.
 */
public class ItemCreateTest extends ZabbixApiTestBase {
    private String createdid;

    @Test
    public void testCreate1() throws Exception {

        ItemCreateRequest request = new ItemCreateRequest();
        ItemCreateRequest.Params params = request.getParams();
        params.setName("Test Item");
        params.setDelay("60s");

        //todo create host
        params.setHostid("10109");
        params.setKey_("agent.hostname");
        params.setValue_type(ZabbixApiParamter.ITEM_VALUE_TYPE.CHARACTOR.value);
        params.setType(0);
        params.setInterfaceid("6");

        ItemCreateResponse response = zabbixApi.item().create(request);

        Gson gson = getGson();
        logger.debug(gson.toJson(response));

        assertNotNull(response);

        assertNotNull(response.getResult().getItemids());

        createdid = response.getResult().getItemids().get(0);
        assertNotNull(createdid);
    }

    @After
    public void tearDown() throws Exception {
        ItemDeleteRequest request = new ItemDeleteRequest();
        request.addItemid(createdid);

        ItemDeleteResponse response = zabbixApi.item().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        String actualId = response.getResult().getItemids().get(0);
        assertThat(createdid, Is.is(actualId.toString()));
    }
}
