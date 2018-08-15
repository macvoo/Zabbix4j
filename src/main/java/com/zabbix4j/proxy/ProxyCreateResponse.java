package com.zabbix4j.proxy;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ProxyCreateResponse extends ZabbixApiResponse {
    private Result result;

    public ProxyCreateResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<String> proxyids;
    }
}
