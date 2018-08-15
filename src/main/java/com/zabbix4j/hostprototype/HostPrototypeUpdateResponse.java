package com.zabbix4j.hostprototype;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class HostPrototypeUpdateResponse extends ZabbixApiResponse {
    private Result result;

    public HostPrototypeUpdateResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {

        private List<Integer> hostids;


    }
}
