package com.zabbix4j.maintenance;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.hostgroup.HostgroupObject;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class MaintenanceGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    @Data
    @Accessors(chain = true)
    public class Result extends MaintenanceObject {

        private List<HostgroupObject> groups;
        private List<TimePeriodObject> timeperiods;
    }
}
