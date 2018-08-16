package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
@Data
@Accessors(chain = true)
public class GraphPrototypeDeleteResponse extends ZabbixApiResponse {
    private Result result;

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<String> graphids;
    }
}
