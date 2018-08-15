package com.zabbix4j.proxy;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ProxyDeleteRequest extends ZabbixApiRequest {
    private List<String> params = new ArrayList<String>();

    public ProxyDeleteRequest() {
        setMethod("proxy.delete");
    }

    public ProxyDeleteRequest addProxyid(final String id) {
        params = ZbxListUtils.add(params, id);
        return this;
    }
}
