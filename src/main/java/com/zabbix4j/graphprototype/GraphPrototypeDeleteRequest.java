package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
@Data
@Accessors(chain = true)
public class GraphPrototypeDeleteRequest extends ZabbixApiRequest {
    private List<String> params;

    public GraphPrototypeDeleteRequest() {
        setMethod("graphprototype.delete");
    }

    public GraphPrototypeDeleteRequest addGraphPrototypeid(final String id) {
        params = ZbxListUtils.add(params, id);
        return this;
    }
}
