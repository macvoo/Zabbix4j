package com.zabbix4j.proxy;

import com.google.gson.annotations.SerializedName;
import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ProxyGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    public ProxyGetResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result extends ProxyObject {

        @SerializedName("interface")
        private ProxyInterfaceObject proxyInterface;
    }
}
