package com.zabbix4j.webscenario;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class HttpTestDeleteResponse extends ZabbixApiResponse {
    private Result result;

    public HttpTestDeleteResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<String> httptestids;
    }
}
