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
public class TriggerPrototypeUpdateRequest extends ZabbixApiRequest {
    private List<TriggerPrototypeObject> params = new ArrayList<TriggerPrototypeObject>();

    public TriggerPrototypeUpdateRequest() {
        setMethod("triggerprototype.update");
    }

    public TriggerPrototypeUpdateRequest addTriggerPrototypeObject(TriggerPrototypeObject id) {
        params.add(id);
        return this;
    }
}
