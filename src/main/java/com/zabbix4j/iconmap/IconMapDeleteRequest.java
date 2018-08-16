package com.zabbix4j.iconmap;

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
public class IconMapDeleteRequest extends ZabbixApiRequest {
    private List<String> params;

    public IconMapDeleteRequest() {
        setMethod("iconmap.delete");
    }

    public IconMapDeleteRequest addIconMapid(final String id) {
        params = ZbxListUtils.add(params, id);
        return this;
    }
}
