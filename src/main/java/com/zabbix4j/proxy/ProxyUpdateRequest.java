package com.zabbix4j.proxy;

import com.google.gson.annotations.SerializedName;
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
public class ProxyUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ProxyUpdateRequest() {
        setMethod("proxy.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends ProxyObject {

        private String proxyid;
        private List<String> hosts;
        @SerializedName("interface")
        private ProxyInterfaceObject proxyInterface;

        public Params addHostid(final String id) {
            hosts = ZbxListUtils.add(hosts, id);
            return this;
        }
    }
}
