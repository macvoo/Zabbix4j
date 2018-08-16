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
public class MaintenanceUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public MaintenanceUpdateRequest() {
        setMethod("maintenance.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends MaintenanceObject {

        private List<String> groupids;
        private List<String> hostids;
        private List<TimePeriodObject> timeperiods;

        public Params addGroupid(final String id) {
            groupids = ZbxListUtils.add(groupids, id);
            return this;
        }

        public Params addHostid(final String id) {
            hostids = ZbxListUtils.add(groupids, id);
            return this;
        }

        public Params addTimePeriod(TimePeriodObject id) {
            timeperiods = ZbxListUtils.add(timeperiods, id);
            return this;
        }
    }
}
