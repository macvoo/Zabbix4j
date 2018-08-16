package com.zabbix4j.itemprototype;

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
public class ItemPrototypeGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ItemPrototypeGetRequest() {
        setMethod("itemprototype.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> discoveryids;
        private List<String> graphids;
        private List<String> hostids;
        private List<String> itemids;
        private List<String> templateids;
        private List<String> triggerIds;
        private Boolean inherited;
        private Boolean monitored;
        private Boolean templated;
        private String selectApplications;
        private String selectDiscoveryRule;
        private String selectGraphs;
        private String selectHosts;
        private String selectTriggers;

        public Params addDiscoveryid(final String id) {
            discoveryids = ZbxListUtils.add(discoveryids, id);
            return this;
        }

        public Params addGraphid(final String id) {
            graphids = ZbxListUtils.add(graphids, id);
            return this;
        }

        public Params addHostid(final String id) {
            hostids = ZbxListUtils.add(hostids, id);
            return this;
        }

        public Params addItemid(final String id) {
            itemids = ZbxListUtils.add(itemids, id);
            return this;
        }

        public Params addTemplateid(final String id) {
            templateids = ZbxListUtils.add(templateids, id);
            return this;
        }

        public Params addTriggerid(final String id) {
            triggerIds = ZbxListUtils.add(triggerIds, id);
            return this;
        }
    }
}
