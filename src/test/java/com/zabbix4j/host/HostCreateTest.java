package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.template.TemplateObject;
import com.zabbix4j.usermacro.Macro;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by Suguru Yajima on 2014/05/01.
 */
public class HostCreateTest extends ZabbixApiTestBase {
    private String hostid;

    public HostCreateTest() {
        super();
    }

    @After
    public void tearDown() throws Exception {
        HostDeleteRequest request = new HostDeleteRequest();
        request.addHostid(hostid);
        zabbixApi.host().delete(request);
    }

    @Before
    public void setUp() throws Exception {
        //  DummyTemplate dummyTemplate = new DummyTemplate(zabbixApi);
        //  templateId = dummyTemplate.create();
    }

    @Test
    public void testCreate1() throws ZabbixApiException {

        // request paramter
        HostCreateRequest request = new HostCreateRequest();
        HostCreateRequest.Params params = request.getParams();

        // set tempalte
        List<TemplateObject> templates = new ArrayList<TemplateObject>();
        templates.add(new TemplateObject().setTemplateid("10093"));
        params.setTemplates(templates);

        // attached to group
        params.addGroupid("12");

        // set macro
        List<Macro> macros = new ArrayList<Macro>();
        Macro macro1 = new Macro();
        macro1.setMacro("{$MACRO1}");
        macro1.setValue("value1");
        macros.add(macro1);
        params.setMacros(macros);

        // host interface
        List<HostInterfaceObject> interfaces = new ArrayList<HostInterfaceObject>();
        HostInterfaceObject hostInterface = new HostInterfaceObject();
        hostInterface.setIp("192.168.255.255");
        interfaces.add(hostInterface);
        params.setInterfaces(interfaces);

        // host
        params.setHost("test host created1");

        // host name
        params.setName("test host created1 name");

        // send create request
        HostCreateResponse response = zabbixApi.host().create(request);

        String hostid = response.getResult().getHostids().get(0);
        this.hostid = hostid.toString();
        System.out.println(this.hostid);
        assertNotEquals("0", hostid);
    }
}
