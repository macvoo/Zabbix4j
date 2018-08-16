package com.zabbix4j.itemprototype;

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
public class ItemPrototypeDeleteRequest extends ZabbixApiRequest {
    private List<String> params;

    public ItemPrototypeDeleteRequest() {
        setMethod("itemprototype.delete");
    }

    public ItemPrototypeDeleteRequest addItemPrototypeid(final String id) {
        params = ZbxListUtils.add(params, id);
        return this;
    }
}
