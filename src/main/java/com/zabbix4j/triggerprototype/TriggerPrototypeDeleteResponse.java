package com.zabbix4j.triggerprototype;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TriggerPrototypeDeleteResponse extends ZabbixApiResponse {
    private Result result;

    public TriggerPrototypeDeleteResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<String> triggerIds;
    }
}
