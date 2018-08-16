package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApiRequest;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TriggerPrototypeDeleteRequest extends ZabbixApiRequest {
    private List<String> params = new ArrayList<String>();

    public TriggerPrototypeDeleteRequest() {
        setMethod("triggerprototype.delete");
    }

    public TriggerPrototypeDeleteRequest addTirggerPrototypeid(final String id) {
        params.add(id);
        return this;
    }
}
