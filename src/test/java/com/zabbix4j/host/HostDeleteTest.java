package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.template.TemplateObject;
import com.zabbix4j.usermacro.Macro;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class HostDeleteTest extends ZabbixApiTestBase {

    public HostDeleteTest() {
        super();
    }

    @Test
    public void testDelete1() throws Exception {

        String hostId = createDummyHost();

        HostDeleteRequest request = new HostDeleteRequest();
        request.addHostid(hostId);

        HostDeleteResponse response = zabbixApi.host().delete(request);

        assertNotNull(response);
        String deletedId = response.getResult().getHostids().get(0).toString();
        assertEquals(hostId, deletedId);
    }

    private String createDummyHost() throws Exception {

        HostCreateRequest request = new HostCreateRequest();
        HostCreateRequest.Params params = request.getParams();

        List<TemplateObject> templates = new ArrayList<TemplateObject>();
        templates.add(new TemplateObject().setTemplateid("10093"));
        params.setTemplates(templates);

        params.addGroupid("12");

        List<Macro> macros = new ArrayList<Macro>();
        Macro macro1 = new Macro();
        macro1.setMacro("{$MACRO1}");
        macro1.setValue("value1");
        macros.add(macro1);
        params.setMacros(macros);

        List<HostInterfaceObject> interfaces = new ArrayList<HostInterfaceObject>();
        HostInterfaceObject hostInterface = new HostInterfaceObject();
        hostInterface.setIp("192.168.255.200");
        interfaces.add(hostInterface);
        params.setInterfaces(interfaces);

        params.setHost("test dummy host created1");
        params.setName("test dummy host created1 name");

        HostCreateResponse response = zabbixApi.host().create(request);

        assertNotNull(response);
        assertNotNull(response.getResult().getHostids());
        String hostId = response.getResult().getHostids().get(0);
        assertNotEquals("0", hostId);

        return hostId.toString();
    }
}
