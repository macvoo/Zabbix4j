package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.discoveryrule.DiscoveryRuleObject;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.hostgroup.HostgroupObject;
import com.zabbix4j.item.ItemObject;
import com.zabbix4j.trigger.FunctionObject;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TriggerPrototypeGetResponse extends ZabbixApiResponse {
    private List<Result> result;


    @Data
    @Accessors(chain = true)
    public class Result extends TriggerPrototypeObject {

        private List<FunctionObject> functions;
        private List<DiscoveryRuleObject> discoveryrules;
        private List<HostgroupObject> groups;
        private List<HostObject> hosts;
        private List<ItemObject> items;
    }
}
