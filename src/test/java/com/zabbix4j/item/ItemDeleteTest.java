package com.zabbix4j.item;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/09.
 */
public class ItemDeleteTest extends ZabbixApiTestBase {

    public ItemDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        String expectedItemid = createItem();
        ItemDeleteRequest request = new ItemDeleteRequest();
        ArrayList<String> itemids = new ArrayList<String>();
        itemids.add(expectedItemid);
        request.setParams(itemids);

        ItemDeleteResponse response = zabbixApi.item().delete(request);

        assertNotNull(response);

        String actualItemid = response.getResult().getItemids().get(0);

        assertEquals(expectedItemid, actualItemid);
    }

    private String createItem() throws ZabbixApiException {

        ItemCreateRequest request = new ItemCreateRequest();
        ItemCreateRequest.Params params = request.getParams();
        params.setName("Test Item for Delete");
        params.setDelay("60");

        //todo create host
        params.setHostid("10109");
        params.setKey_("agent.ping");
        params.setValue_type(ZabbixApiParamter.ITEM_VALUE_TYPE.CHARACTOR.value);
        params.setType(0);
        params.setInterfaceid("6");

        ItemCreateResponse response = zabbixApi.item().create(request);

        return response.getResult().getItemids().get(0).toString();
    }
}
