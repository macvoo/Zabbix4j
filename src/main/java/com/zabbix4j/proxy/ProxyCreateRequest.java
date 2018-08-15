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
public class ProxyCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ProxyCreateRequest() {
        setMethod("proxy.create");
    }
    public class Params extends ProxyObject {

        private List<Host> hosts;
        @SerializedName("interface")
        private ProxyInterfaceObject proxyInterface;

        public Params addHostid(final String id) {
            Host host = new Host();
            host.setHostid(id);
            hosts = ZbxListUtils.add(hosts, host);
            return this;
        }
    }

    @Data
    @Accessors(chain = true)
    public class Host {
        private String hostid;
    }
}
