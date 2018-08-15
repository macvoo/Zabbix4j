package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.application.ApplicationObject;
import com.zabbix4j.discoveryrule.DiscoveryRuleObject;
import com.zabbix4j.graph.GraphObject;
import com.zabbix4j.hostgroup.HostgroupObject;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.item.ItemObject;
import com.zabbix4j.trigger.TriggerObject;
import com.zabbix4j.usermacro.Macro;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
@Data
@Accessors(chain = true)
public class HostGetResponse extends ZabbixApiResponse {
    private List<Result> result = new ArrayList<Result>();

    @Data
    @Accessors(chain = true)
    public class Result extends HostObject {

        private List<HostgroupObject> groups;
        // TODO: implement a variable
        //private List<Template> parentTemplates;
        private List<ItemObject> items;
// TODO: implement a variable
        //private List<Discoveriy> discoveries;

        private List<TriggerObject> triggers;
        private List<GraphObject> graphs;
        // TODO: implement a variable
        //private List<HttpTestObject> httpTests;
        private List<ApplicationObject> applications;

        private List<Macro> macros;
        // TODO: implement a variable
        //private List<Inventory> inventory;
        private List<HostInterfaceObject> interfaces;
        // TODO: implement a variable
        //private List<screens> screens;
        private List<DiscoveryRuleObject> discoveryRule;
        private List<HostObject> hostDiscovery;
    }
}
