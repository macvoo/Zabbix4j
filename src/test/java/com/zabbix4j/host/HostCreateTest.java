package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.hostgroup.HostgroupTest;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.template.DummyTemplate;
import com.zabbix4j.template.TemplateDeleteRequest;
import com.zabbix4j.template.TemplateDeleteResponse;
import com.zabbix4j.usermacro.Macro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Suguru Yajima on 2014/05/01.
 */
public class HostCreateTest extends ZabbixApiTestBase {
    private Integer templateId;

    public HostCreateTest() {
        super();
    }

    @After
    public void tearDown() throws Exception {
        TemplateDeleteRequest request = new TemplateDeleteRequest();
        request.addTemplateId(templateId);
        TemplateDeleteResponse response = zabbixApi.template().delete(request);
    }

    @Before
    public void setUp() throws Exception {
      //  DummyTemplate dummyTemplate = new DummyTemplate(zabbixApi);
      //  templateId = dummyTemplate.create();
    }

    @Test
    public void testCreate1() throws ZabbixApiException {

        HostCreateRequest request = new HostCreateRequest();
        HostCreateRequest.Params params = request.getParams();

        params.addTemplateId(templateId);
        params.addGroupId(4);

        List<Macro> macros = new ArrayList<Macro>();
        Macro macro1 = new Macro();
        macro1.setMacro("{$MACRO1}");
        macro1.setValue("value1");
        macros.add(macro1);
        params.setMacros(macros);

        HostInterfaceObject hostInterface = new HostInterfaceObject();
        hostInterface.setIp("192.168.255.255");
        params.addHostInterfaceObject(hostInterface);

        params.setHost("test host created1." + new Date().getTime());
        params.setName("test host created1 name" + new Date().getTime());

        HostCreateResponse response = zabbixApi.host().create(request);
        assertNotNull(response);

        assertNotNull(response.getResult().getHostids());
        int hostId = response.getResult().getHostids().get(0);
        assertTrue(0 < hostId);
    }
}
