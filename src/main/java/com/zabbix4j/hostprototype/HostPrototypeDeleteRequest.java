package com.zabbix4j.hostprototype;

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
public class HostPrototypeDeleteRequest extends ZabbixApiRequest {
    private List<String> params;

    public HostPrototypeDeleteRequest() {
        setMethod("hostprototype.delete");
    }

    public HostPrototypeDeleteRequest addHostid(final String id) {
        params = ZbxListUtils.add(params, id);
        return this;
    }
}
