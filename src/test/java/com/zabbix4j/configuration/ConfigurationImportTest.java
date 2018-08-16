package com.zabbix4j.configuration;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.host.HostCreateRequest;
import com.zabbix4j.host.HostCreateResponse;
import com.zabbix4j.host.HostDeleteRequest;
import com.zabbix4j.host.HostDeleteResponse;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.usermacro.Macro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Suguru Yajima on 2014/05/24.
 */
public class ConfigurationImportTest extends ZabbixApiTestBase {
    private String id;

    public ConfigurationImportTest() {
        super();
    }

    @After
    public void tearDown() throws Exception {
        deleteDummy(id);
    }

    @Test
    public void testImport1() throws Exception {
        id = createDummyHost();
        String xml = export(id);

        ConfigurationImportRequest request = new ConfigurationImportRequest();
        ConfigurationImportRequest.Params params = request.getParams();
        params.setFormat(Configuration.FORMAT.XML.value);
        params.setSource(xml);
        Rules rules = new Rules();
        Rules.Hosts hosts = rules.getHosts();
        hosts.setCreateMissing(true);
        hosts.setUpdateExisting(true);
        params.setRules(rules);

        ConfigurationImportResponse response = zabbixApi.configuration().imports(request);
        assertNotNull(response);

        assertTrue(response.getResult());
    }

    private String export(final String id) throws ZabbixApiException {
        ConfigurationExportRequest request = new ConfigurationExportRequest();
        ConfigurationExportRequest.Params params = request.getParams();
        params.setFormat(Configuration.FORMAT.XML.value);
        Option option = new Option();
        option.addHostid(id);
        params.setOptions(option);

        ConfigurationExportResponse response = zabbixApi.configuration().export(request);

        return response.getResult();
    }

    private String createDummyHost() throws Exception {
        final String groupId = "4";

        HostCreateRequest request = new HostCreateRequest();
        HostCreateRequest.Params params = request.getParams();

        List<Integer> templates = new ArrayList<Integer>();
        templates.add(10093);
        // params.setTemplates(templates);

        params.addGroupid(groupId);

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

        params.setHost("127.0.0.1");
        params.setName("test dummy host fort import " + new Date().getTime());

        HostCreateResponse response = zabbixApi.host().create(request);

        assertNotNull(response);
        assertNotNull(response.getResult().getHostids());
        String hostId = response.getResult().getHostids().get(0);
        assertNotEquals("0", hostId);

        return hostId.toString();
    }

    private void deleteDummy(final String id) throws ZabbixApiException {
        HostDeleteRequest request = new HostDeleteRequest();
        request.addHostid(id);

        HostDeleteResponse response = zabbixApi.host().delete(request);
    }
}
