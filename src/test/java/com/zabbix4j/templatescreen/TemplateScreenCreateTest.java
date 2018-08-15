package com.zabbix4j.templatescreen;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.screenitem.ScreenItemObject;
import java.util.Date;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenCreateTest extends ZabbixApiTestBase {
    private final String templateId = "10166";
    private final String resourceId = "495";

    @Test
    public void testCreate() throws Exception {

        TemplateScreenCreateRequest request = new TemplateScreenCreateRequest();
        TemplateScreenCreateRequest.Params params = request.getParams();
        params.setName("test.templatescreen.create." + new Date().getTime());
        params.setTemplateid(templateId);
        params.setHsize(3);
        params.setVsize(2);

        ScreenItemObject obj = new ScreenItemObject();
        obj.setResourcetype(ScreenItemObject.RESOURCE_TYPE.GRAPH.value);
        obj.setResourceid(resourceId);
        obj.setRowspan(0);
        obj.setColspan(0);
        obj.setX(0);
        obj.setY(0);
        params.addScreenItem(obj);

        TemplateScreenCreateResponse response = zabbixApi.templateScreen().create(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        String actualId = response.getResult().getScreenids().get(0);
        assertNotNull(actualId);
    }
}
