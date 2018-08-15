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

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addMaintenanceId(Integer id) {
            maintenanceids = ZbxListUtils.add(maintenanceids, id);
            return this;
        }
    }
}
