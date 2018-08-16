package com.zabbix4j.triggerprototype;

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
public class TriggerPrototypeGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TriggerPrototypeGetRequest() {
        setMethod("triggerprototype.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private Boolean active;
        private List<String> applicationids;
        private List<String> discoveryids;
        private List<String> functions;
        private List<String> groupids;
        private List<String> hostids;
        private List<String> templateids;
        private List<String> triggerIds;
        private String group;
        private String host;
        private Boolean inherited;
        private Boolean maintenance;
        private Integer min_severity;
        private String monitored;
        private Boolean templated;
        private String expandData;
        private String expandExpression;
        private String selectDiscoveryRule;
        private String selectFunctions;
        private String selectGroups;
        private String selectHosts;
        private String selectItems;

        public Params addApplicationid(final String id) {
            applicationids = ZbxListUtils.add(applicationids, id);
            return this;
        }

        public Params addDiscoveryid(final String id) {
            discoveryids = ZbxListUtils.add(discoveryids, id);
            return this;
        }

        public Params addFunction(String id) {
            functions = ZbxListUtils.add(functions, id);
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
