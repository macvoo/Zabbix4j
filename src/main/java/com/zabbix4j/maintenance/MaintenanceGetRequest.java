package com.zabbix4j.maintenance;

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
public class MaintenanceGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public MaintenanceGetRequest() {
        setMethod("maintenance.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private List<String> groupids;
        private List<String> hostids;
        private List<String> maintenanceids;
        private String selectGroups;
        private String selectHosts;
        private String selectTimeperiods;

        public Params addGroupid(final String id) {
            groupids = ZbxListUtils.add(groupids, id);
            return this;
        }

        public Params addHostid(final String id) {
            hostids = ZbxListUtils.add(hostids, id);
            return this;
        }

        public Params addMaintenanceid(final String id) {
            maintenanceids = ZbxListUtils.add(maintenanceids, id);
            return this;
        }
    }
}
