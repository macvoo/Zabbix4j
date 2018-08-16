package com.zabbix4j.graphprototype;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
@Data
@Accessors(chain = true)
public class GraphPrototypeGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public GraphPrototypeGetRequest() {
        setMethod("graphprototype.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> discoveryids;
        private List<String> graphids;
        private List<String> groupids;
        private List<String> hostids;
        private Boolean inherited;
        private List<String> itemids;
        private Boolean templated;
        private List<String> templateids;
        private String selectDiscoveryRule;
        private String selectGraphItems;
        private String selectGroups;
        private String selectHosts;
        private String selectItems;
        private String selectTemplates;

        public Params addDiscoveryid(final String id) {
            discoveryids = ZbxListUtils.add(discoveryids, id);
            return this;
        }

        public Params addGraphid(final String id) {
            graphids = ZbxListUtils.add(graphids, id);
            return this;
        }

        public Params addGroupid(final String id) {
            groupids = ZbxListUtils.add(groupids, id);
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
    }
}
