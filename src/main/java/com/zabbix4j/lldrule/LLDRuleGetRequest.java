package com.zabbix4j.lldrule;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class LLDRuleGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public LLDRuleGetRequest() {
        setMethod("discoveryrule.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private List<String> itemids;
        private List<String> hostids;
        private List<String> interfaceids;
        private List<String> templateids;
        private Boolean inherited;
        private Boolean monitored;
        private Boolean templated;
        private String selectHosts;
        private String selectGraphs;
        private String selectHostPrototypes;
        private String selectItems;
        private String selectTriggers;

        public void addItemId(Integer id) {
            itemids = ZbxListUtils.add(itemids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addInterfaceId(Integer id) {
            interfaceids = ZbxListUtils.add(interfaceids, id);
        }

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
            return this;
        }
    }
}
