package com.zabbix4j.proxy;

import com.zabbix4j.GetRequestCommonParams;
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
public class ProxyGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ProxyGetRequest() {
        setMethod("proxy.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> proxyids;
        private String selectHosts;
        private String selectInterface;

        public Params addProxyid(final String id) {
            proxyids = ZbxListUtils.add(proxyids, id);
            return this;
        }
    }
}
