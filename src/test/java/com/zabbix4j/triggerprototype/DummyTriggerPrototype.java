package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;
import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class DummyTriggerPrototype extends ZabbixApiTestDummyMethodBase {
    public DummyTriggerPrototype(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String create() throws ZabbixApiException {
        TriggerPrototypeCreateRequest request = new TriggerPrototypeCreateRequest();

        TriggerPrototypeObject obj = new TriggerPrototypeObject();
        obj.setDescription("test Free disk space is less than 20% on volume {#FSNAME} " + new Date().getTime());
        obj.setExpression("{Zabbix server:vfs.fs.size[{#FSNAME},pfree].last(0)}<20");
        request.addTriggerPrototypeObject(obj);

        TriggerPrototypeCreateResponse response = zabbixApi.triggerPrototype().create(request);

        return response.getResult().getTriggerIds().get(0);
    }

    public void delete(String targetId) throws ZabbixApiException {

        TriggerPrototypeDeleteRequest request = new TriggerPrototypeDeleteRequest();
        request.addTirggerPrototypeid(targetId);

        TriggerPrototypeDeleteResponse response = zabbixApi.triggerPrototype().delete(request);
    }
}
