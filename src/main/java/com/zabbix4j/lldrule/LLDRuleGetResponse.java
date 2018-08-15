package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.graph.GraphObject;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.hostprototype.HostPrototypeObject;
import com.zabbix4j.item.ItemObject;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class LLDRuleGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    @Data
    @Accessors(chain = true)
    public class Result extends LLDRuleObject {

        private List<HostObject> hosts;
        private List<ItemObject> items;
        private List<GraphObject> graphs;
        private List<HostPrototypeObject> hostPrototypes;
    }
}
