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
public class TriggerPrototypeCreateRequest extends ZabbixApiRequest {
    private List<TriggerPrototypeObject> params = new ArrayList<TriggerPrototypeObject>();

    public TriggerPrototypeCreateRequest() {
        setMethod("triggerprototype.create");
    }

    public TriggerPrototypeCreateRequest addTriggerPrototypeObject(TriggerPrototypeObject id) {
        this.params.add(id);
        return this;
    }
}
