package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ItemPrototypeUpdateResponse extends ZabbixApiResponse {
    private Result result;

    public ItemPrototypeUpdateResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<String> itemids;
    }
}
