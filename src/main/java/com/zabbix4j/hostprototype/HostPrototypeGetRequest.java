package com.zabbix4j.hostprototype;

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
public class HostPrototypeGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostPrototypeGetRequest() {
        setMethod("hostprototype.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private List<String> hostids;
        private List<String> discoveryids;
        private Boolean inherited;
        private String selectDiscoveryRule;
        private String selectGroupLinks;
        private String selectGroupPrototypes;
        private List<String> selectInventory;
        private String selectParentHost;
        private String selectTemplates;

        public Params addHostid(final String id) {
            hostids = ZbxListUtils.add(hostids, id);
            return this;
        }

        public Params addDiscoveryid(final String id) {
            discoveryids = ZbxListUtils.add(discoveryids, id);
            return this;
        }

        public Params addSelectInventory(final String id) {
            selectInventory = ZbxListUtils.add(selectInventory, id);
            return this;
        }
    }
}
