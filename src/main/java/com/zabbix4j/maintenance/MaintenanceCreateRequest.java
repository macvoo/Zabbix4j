package com.zabbix4j.maintenance;

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
public class MaintenanceCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public MaintenanceCreateRequest() {
        setMethod("maintenance.create");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends MaintenanceObject {

        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<TimePeriodObject> timeperiods;

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public Params addTimeperiodid(TimePeriodObject id) {
            timeperiods = ZbxListUtils.add(timeperiods, id);
            return this;
        }
    }
}
