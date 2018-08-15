package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.graph.GraphObject;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.hostgroup.HostgroupObject;
import com.zabbix4j.item.ItemObject;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/03.
 */
@Data
@Accessors(chain = true)
public class GraphPrototypeGetResponse extends ZabbixApiResponse {
    private List<Result> result;


    @Data
    @Accessors(chain = true)
    public class Result extends GraphPrototypeObject {
        private List<ItemObject> items;
        private List<GraphObject> gitems;
        private List<HostgroupObject> groups;
        private List<HostObject> hosts;
        // TODO: implement a variable
        //private List<TemplateObject> templates;
        // TODO: implement a variable
        //private List<LLDRuleObject> discoveryRule;
    }
}
