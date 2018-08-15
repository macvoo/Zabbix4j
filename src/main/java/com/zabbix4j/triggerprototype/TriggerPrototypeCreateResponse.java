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
public class TriggerPrototypeCreateResponse extends ZabbixApiResponse {
    private Result result;

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<Integer> triggerids;

    }
}
