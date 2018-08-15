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
public class MaintenanceDeleteRequest extends ZabbixApiRequest {

    private List<Integer> params;

    public MaintenanceDeleteRequest() {
        setMethod("maintenance.delete");
    }

    public void addMaintenaceId(Integer id) {
        params = ZbxListUtils.add(params, id);
    }
}
