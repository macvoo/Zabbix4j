package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.usermacro.Macro;
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Created by Suguru Yajima on 2014/05/01.
 */
public class HostUpdateTest extends ZabbixApiTestBase {

    public HostUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() {

        String targetHostId = "10108";
        try {
            HostUpdateRequest request = new HostUpdateRequest();
            HostUpdateRequest.Params params = request.getParams();

            params.setHostid(targetHostId);
            params.setHost("192.168.100.100");
            params.setName("test host update1");

            params.addGroup(2);

            params.addTemplatesClear("10093");

            ArrayList<Integer> templates = new ArrayList<Integer>();
            templates.add(10093);
            params.setTemplates(templates);

            Macro macro = new Macro();
            macro.setMacro("{$MACRO2}");
            macro.setValue("VALUE2");
            params.addMacro(macro);

            HostUpdateResponse response = zabbixApi.host().update(request);

            assertNotNull(response);
            String actualId = response.getResult().getHostids().get(0).toString();
            assertEquals(targetHostId, actualId);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
