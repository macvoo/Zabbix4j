package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class LLDRuleUpdateResponse extends ZabbixApiResponse {
    private Result result;

    public LLDRuleUpdateResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<String> itemids;
    }
}
