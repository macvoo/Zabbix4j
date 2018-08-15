package com.zabbix4j.maintenance;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class MaintenanceDeleteTest extends ZabbixApiTestBase {

    public MaintenanceDeleteTest() {
        super();
    }

    @Test
    public void testName() throws Exception {
        DummyMaintenance dummyMaintenance = new DummyMaintenance(zabbixApi);
        String targetId = dummyMaintenance.create();

        MaintenanceDeleteRequest request = new MaintenanceDeleteRequest();
        request.addMaintenaceid(targetId);

        MaintenanceDeleteResponse response = zabbixApi.maintenance().delete(request);
        assertNotNull(response);

        String actualId = response.getResult().getMaintenanceids().get(0);
        assertThat(targetId, is(actualId));
    }
}
