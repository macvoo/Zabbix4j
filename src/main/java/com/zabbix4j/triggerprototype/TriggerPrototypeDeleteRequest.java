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
    private List<Integer> params = new ArrayList<Integer>();

    public TriggerPrototypeDeleteRequest() {
        setMethod("triggerprototype.delete");
    }

    public void addTirggerPrototypeId(Integer id) {
        params.add(id);
        return this;
    }
}
